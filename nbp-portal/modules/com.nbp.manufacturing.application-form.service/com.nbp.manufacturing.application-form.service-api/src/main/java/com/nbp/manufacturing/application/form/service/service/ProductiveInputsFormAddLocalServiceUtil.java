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

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ProductiveInputsFormAdd. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ProductiveInputsFormAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddLocalService
 * @generated
 */
public class ProductiveInputsFormAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ProductiveInputsFormAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the productive inputs form add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was added
	 */
	public static ProductiveInputsFormAdd addProductiveInputsFormAdd(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return getService().addProductiveInputsFormAdd(productiveInputsFormAdd);
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
	 * Creates a new productive inputs form add with the primary key. Does not add the productive inputs form add to the database.
	 *
	 * @param productiveInputsFormAddId the primary key for the new productive inputs form add
	 * @return the new productive inputs form add
	 */
	public static ProductiveInputsFormAdd createProductiveInputsFormAdd(
		long productiveInputsFormAddId) {

		return getService().createProductiveInputsFormAdd(
			productiveInputsFormAddId);
	}

	public static void deleteMultipleFormsBy_Id(long applicationId) {
		getService().deleteMultipleFormsBy_Id(applicationId);
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
	 * Deletes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws PortalException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd deleteProductiveInputsFormAdd(
			long productiveInputsFormAddId)
		throws PortalException {

		return getService().deleteProductiveInputsFormAdd(
			productiveInputsFormAddId);
	}

	/**
	 * Deletes the productive inputs form add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was removed
	 */
	public static ProductiveInputsFormAdd deleteProductiveInputsFormAdd(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return getService().deleteProductiveInputsFormAdd(
			productiveInputsFormAdd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
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

	public static ProductiveInputsFormAdd fetchProductiveInputsFormAdd(
		long productiveInputsFormAddId) {

		return getService().fetchProductiveInputsFormAdd(
			productiveInputsFormAddId);
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

	public static List<ProductiveInputsFormAdd> getMA_PIF(
		long manufacturingApplicationId) {

		return getService().getMA_PIF(manufacturingApplicationId);
	}

	public static List<ProductiveInputsFormAdd> getMA_PII(
		long productiveInputsFormId) {

		return getService().getMA_PII(productiveInputsFormId);
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
	 * Returns the productive inputs form add with the primary key.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws PortalException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd getProductiveInputsFormAdd(
			long productiveInputsFormAddId)
		throws PortalException {

		return getService().getProductiveInputsFormAdd(
			productiveInputsFormAddId);
	}

	/**
	 * Returns a range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> getProductiveInputsFormAdds(
		int start, int end) {

		return getService().getProductiveInputsFormAdds(start, end);
	}

	/**
	 * Returns the number of productive inputs form adds.
	 *
	 * @return the number of productive inputs form adds
	 */
	public static int getProductiveInputsFormAddsCount() {
		return getService().getProductiveInputsFormAddsCount();
	}

	/**
	 * Updates the productive inputs form add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductiveInputsFormAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 * @return the productive inputs form add that was updated
	 */
	public static ProductiveInputsFormAdd updateProductiveInputsFormAdd(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return getService().updateProductiveInputsFormAdd(
			productiveInputsFormAdd);
	}

	public static ProductiveInputsFormAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ProductiveInputsFormAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			ProductiveInputsFormAddLocalServiceUtil.class,
			ProductiveInputsFormAddLocalService.class);

}