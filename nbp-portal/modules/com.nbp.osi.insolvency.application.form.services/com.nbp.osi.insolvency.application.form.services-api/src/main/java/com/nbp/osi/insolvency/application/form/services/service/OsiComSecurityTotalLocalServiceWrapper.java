/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiComSecurityTotalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotalLocalService
 * @generated
 */
public class OsiComSecurityTotalLocalServiceWrapper
	implements OsiComSecurityTotalLocalService,
			   ServiceWrapper<OsiComSecurityTotalLocalService> {

	public OsiComSecurityTotalLocalServiceWrapper() {
		this(null);
	}

	public OsiComSecurityTotalLocalServiceWrapper(
		OsiComSecurityTotalLocalService osiComSecurityTotalLocalService) {

		_osiComSecurityTotalLocalService = osiComSecurityTotalLocalService;
	}

	/**
	 * Adds the osi com security total to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComSecurityTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComSecurityTotal the osi com security total
	 * @return the osi com security total that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal addOsiComSecurityTotal(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComSecurityTotal osiComSecurityTotal) {

		return _osiComSecurityTotalLocalService.addOsiComSecurityTotal(
			osiComSecurityTotal);
	}

	/**
	 * Creates a new osi com security total with the primary key. Does not add the osi com security total to the database.
	 *
	 * @param osiComSecurityTotalId the primary key for the new osi com security total
	 * @return the new osi com security total
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal createOsiComSecurityTotal(
				long osiComSecurityTotalId) {

		return _osiComSecurityTotalLocalService.createOsiComSecurityTotal(
			osiComSecurityTotalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComSecurityTotalLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi com security total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComSecurityTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total that was removed
	 * @throws PortalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal deleteOsiComSecurityTotal(
					long osiComSecurityTotalId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComSecurityTotalLocalService.deleteOsiComSecurityTotal(
			osiComSecurityTotalId);
	}

	/**
	 * Deletes the osi com security total from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComSecurityTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComSecurityTotal the osi com security total
	 * @return the osi com security total that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal deleteOsiComSecurityTotal(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComSecurityTotal osiComSecurityTotal) {

		return _osiComSecurityTotalLocalService.deleteOsiComSecurityTotal(
			osiComSecurityTotal);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComSecurityTotalLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiComSecurityTotalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiComSecurityTotalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiComSecurityTotalLocalService.dynamicQuery();
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

		return _osiComSecurityTotalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComSecurityTotalModelImpl</code>.
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

		return _osiComSecurityTotalLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComSecurityTotalModelImpl</code>.
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

		return _osiComSecurityTotalLocalService.dynamicQuery(
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

		return _osiComSecurityTotalLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiComSecurityTotalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal fetchOsiComSecurityTotal(
				long osiComSecurityTotalId) {

		return _osiComSecurityTotalLocalService.fetchOsiComSecurityTotal(
			osiComSecurityTotalId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiComSecurityTotalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiComSecurityTotalLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiComSecurityTotalLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchOsiComSecurityTotalException {

		return _osiComSecurityTotalLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi com security total with the primary key.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total
	 * @throws PortalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal getOsiComSecurityTotal(
					long osiComSecurityTotalId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComSecurityTotalLocalService.getOsiComSecurityTotal(
			osiComSecurityTotalId);
	}

	/**
	 * Returns a range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @return the range of osi com security totals
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal> getOsiComSecurityTotals(int start, int end) {

		return _osiComSecurityTotalLocalService.getOsiComSecurityTotals(
			start, end);
	}

	/**
	 * Returns the number of osi com security totals.
	 *
	 * @return the number of osi com security totals
	 */
	@Override
	public int getOsiComSecurityTotalsCount() {
		return _osiComSecurityTotalLocalService.getOsiComSecurityTotalsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComSecurityTotalLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi com security total in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComSecurityTotalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComSecurityTotal the osi com security total
	 * @return the osi com security total that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComSecurityTotal updateOsiComSecurityTotal(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComSecurityTotal osiComSecurityTotal) {

		return _osiComSecurityTotalLocalService.updateOsiComSecurityTotal(
			osiComSecurityTotal);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiComSecurityTotalLocalService.getBasePersistence();
	}

	@Override
	public OsiComSecurityTotalLocalService getWrappedService() {
		return _osiComSecurityTotalLocalService;
	}

	@Override
	public void setWrappedService(
		OsiComSecurityTotalLocalService osiComSecurityTotalLocalService) {

		_osiComSecurityTotalLocalService = osiComSecurityTotalLocalService;
	}

	private OsiComSecurityTotalLocalService _osiComSecurityTotalLocalService;

}