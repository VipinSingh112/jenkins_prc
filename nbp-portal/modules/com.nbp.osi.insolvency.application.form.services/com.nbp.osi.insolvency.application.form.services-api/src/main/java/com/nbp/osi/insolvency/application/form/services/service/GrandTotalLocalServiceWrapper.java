/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GrandTotalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotalLocalService
 * @generated
 */
public class GrandTotalLocalServiceWrapper
	implements GrandTotalLocalService, ServiceWrapper<GrandTotalLocalService> {

	public GrandTotalLocalServiceWrapper() {
		this(null);
	}

	public GrandTotalLocalServiceWrapper(
		GrandTotalLocalService grandTotalLocalService) {

		_grandTotalLocalService = grandTotalLocalService;
	}

	/**
	 * Adds the grand total to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GrandTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param grandTotal the grand total
	 * @return the grand total that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
		addGrandTotal(
			com.nbp.osi.insolvency.application.form.services.model.GrandTotal
				grandTotal) {

		return _grandTotalLocalService.addGrandTotal(grandTotal);
	}

	/**
	 * Creates a new grand total with the primary key. Does not add the grand total to the database.
	 *
	 * @param grandTotalId the primary key for the new grand total
	 * @return the new grand total
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
		createGrandTotal(long grandTotalId) {

		return _grandTotalLocalService.createGrandTotal(grandTotalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _grandTotalLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the grand total from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GrandTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param grandTotal the grand total
	 * @return the grand total that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
		deleteGrandTotal(
			com.nbp.osi.insolvency.application.form.services.model.GrandTotal
				grandTotal) {

		return _grandTotalLocalService.deleteGrandTotal(grandTotal);
	}

	/**
	 * Deletes the grand total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GrandTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total that was removed
	 * @throws PortalException if a grand total with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
			deleteGrandTotal(long grandTotalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _grandTotalLocalService.deleteGrandTotal(grandTotalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _grandTotalLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _grandTotalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _grandTotalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _grandTotalLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _grandTotalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _grandTotalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _grandTotalLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _grandTotalLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _grandTotalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
		fetchGrandTotal(long grandTotalId) {

		return _grandTotalLocalService.fetchGrandTotal(grandTotalId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _grandTotalLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the grand total with the primary key.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total
	 * @throws PortalException if a grand total with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
			getGrandTotal(long grandTotalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _grandTotalLocalService.getGrandTotal(grandTotalId);
	}

	/**
	 * Returns a range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @return the range of grand totals
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.GrandTotal>
			getGrandTotals(int start, int end) {

		return _grandTotalLocalService.getGrandTotals(start, end);
	}

	/**
	 * Returns the number of grand totals.
	 *
	 * @return the number of grand totals
	 */
	@Override
	public int getGrandTotalsCount() {
		return _grandTotalLocalService.getGrandTotalsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _grandTotalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _grandTotalLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
			getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchGrandTotalException {

		return _grandTotalLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _grandTotalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the grand total in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GrandTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param grandTotal the grand total
	 * @return the grand total that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.GrandTotal
		updateGrandTotal(
			com.nbp.osi.insolvency.application.form.services.model.GrandTotal
				grandTotal) {

		return _grandTotalLocalService.updateGrandTotal(grandTotal);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _grandTotalLocalService.getBasePersistence();
	}

	@Override
	public GrandTotalLocalService getWrappedService() {
		return _grandTotalLocalService;
	}

	@Override
	public void setWrappedService(
		GrandTotalLocalService grandTotalLocalService) {

		_grandTotalLocalService = grandTotalLocalService;
	}

	private GrandTotalLocalService _grandTotalLocalService;

}