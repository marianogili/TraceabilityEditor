/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram.provider;


import java.util.Collection;
import java.util.List;

import marianogili.model.traceabilityeditordiagram.Artefact;
import marianogili.model.traceabilityeditordiagram.TraceLink;
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramFactory;
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;
import marianogili.model.traceabilityeditordiagram.Transformation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link marianogili.model.traceabilityeditordiagram.Transformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class TransformationItemProvider
	extends DiagramElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		ITableItemLabelProvider,
		IItemPropertySource {
	
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO Auto-generated method stub
		return super.getColumnImage(object, columnIndex);
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (columnIndex == 0) return getText(object);
		IItemLabelProvider itemLabelProvider;
		TraceLink traceLink = ((Transformation)object).getTraceLinks().get(0);
		if (traceLink == null) return "";
		if (columnIndex == 1) {
			itemLabelProvider =
				(IItemLabelProvider)adapterFactory.adapt(
						traceLink, IItemLabelProvider.class);
			return itemLabelProvider.getText(traceLink);
		}
		Artefact artefact = traceLink.getSources().get(0);
		if (artefact == null) return "";
		if (columnIndex == 2) {
			itemLabelProvider =
				(IItemLabelProvider)adapterFactory.adapt(
						artefact, IItemLabelProvider.class);
			return itemLabelProvider.getText(artefact);
		}
		artefact = traceLink.getTargets().get(0);
		if (artefact == null) return "";
		itemLabelProvider =
			(IItemLabelProvider)adapterFactory.adapt(
					artefact, IItemLabelProvider.class);
		return itemLabelProvider.getText(artefact);
	}

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TraceabilityeditordiagramPackage.Literals.TRANSFORMATION__TRACE_LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Transformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transformation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Transformation_type") :
			getString("_UI_Transformation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transformation.class)) {
			case TraceabilityeditordiagramPackage.TRANSFORMATION__TRACE_LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityeditordiagramPackage.Literals.TRANSFORMATION__TRACE_LINKS,
				 TraceabilityeditordiagramFactory.eINSTANCE.createTraceLink()));
	}

}
