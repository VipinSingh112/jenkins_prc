/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ProductiveInputsForm. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ProductiveInputsFormLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormLocalService
 * @generated
 */
public class ProductiveInputsFormLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ProductiveInputsFormLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the productive inputs form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was added
	 */
	public static ProductiveInputsForm addProductiveInputsForm(
		ProductiveInputsForm productiveInputsForm) {

		return getService().addProductiveInputsForm(productiveInputsForm);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new productive inputs form with the primary key. Does not add the productive inputs form to the database.
	 *
	 * @param productiveInputsFormId the primary key for the new productive inputs form
	 * @return the new productive inputs form
	 */
	public static ProductiveInputsForm createProductiveInputsForm(
		long productiveInputsFormId) {

		return getService().createProductiveInputsForm(productiveInputsFormId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws PortalException if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm deleteProductiveInputsForm(
			long productiveInputsFormId)
		throws PortalException {

		return getService().deleteProductiveInputsForm(productiveInputsFormId);
	}

	/**
	 * Deletes the productive inputs form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was removed
	 */
	public static ProductiveInputsForm deleteProductiveInputsForm(
		ProductiveInputsForm productiveInputsForm) {

		return getService().deleteProductiveInputsForm(productiveInputsForm);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ProductiveInputsForm fetchProductiveInputsForm(
		long productiveInputsFormId) {

		return getService().fetchProductiveInputsForm(productiveInputsFormId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<ProductiveInputsForm> getMA_PI_MAI(long applicationId) {
		return getService().getMA_PI_MAI(applicationId);
	}

	public static ProductiveInputsForm getManuByAppId(long applicationId) {
		return getService().getManuByAppId(applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the productive inputs form with the primary key.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws PortalException if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm getProductiveInputsForm(
			long productiveInputsFormId)
		throws PortalException {

		return getService().getProductiveInputsForm(productiveInputsFormId);
	}

	/**
	 * Returns a range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of productive inputs forms
	 */
	public static List<ProductiveInputsForm> getProductiveInputsForms(
		int start, int end) {

		return getService().getProductiveInputsForms(start, end);
	}

	/**
	 * Returns the number of productive inputs forms.
	 *
	 * @return the number of productive inputs forms
	 */
	public static int getProductiveInputsFormsCount() {
		return getService().getProductiveInputsFormsCount();
	}

	/**
	 * Updates the productive inputs form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsForm the productive inputs form
	 * @return the productive inputs form that was updated
	 */
	public static ProductiveInputsForm updateProductiveInputsForm(
		ProductiveInputsForm productiveInputsForm) {

		return getService().updateProductiveInputsForm(productiveInputsForm);
	}

	public static ProductiveInputsFormLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ProductiveInputsFormLocalService>
		_serviceSnapshot = new Snapshot<>(
			ProductiveInputsFormLocalServiceUtil.class,
			ProductiveInputsFormLocalService.class);

}