/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoNonHotelLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicenceLocalService
 * @generated
 */
public class AccoNonHotelLicenceLocalServiceWrapper
	implements AccoNonHotelLicenceLocalService,
			   ServiceWrapper<AccoNonHotelLicenceLocalService> {

	public AccoNonHotelLicenceLocalServiceWrapper() {
		this(null);
	}

	public AccoNonHotelLicenceLocalServiceWrapper(
		AccoNonHotelLicenceLocalService accoNonHotelLicenceLocalService) {

		_accoNonHotelLicenceLocalService = accoNonHotelLicenceLocalService;
	}

	/**
	 * Adds the acco non hotel licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		addAccoNonHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
				accoNonHotelLicence) {

		return _accoNonHotelLicenceLocalService.addAccoNonHotelLicence(
			accoNonHotelLicence);
	}

	/**
	 * Creates a new acco non hotel licence with the primary key. Does not add the acco non hotel licence to the database.
	 *
	 * @param accoNonHotelLicenceId the primary key for the new acco non hotel licence
	 * @return the new acco non hotel licence
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		createAccoNonHotelLicence(long accoNonHotelLicenceId) {

		return _accoNonHotelLicenceLocalService.createAccoNonHotelLicence(
			accoNonHotelLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acco non hotel licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		deleteAccoNonHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
				accoNonHotelLicence) {

		return _accoNonHotelLicenceLocalService.deleteAccoNonHotelLicence(
			accoNonHotelLicence);
	}

	/**
	 * Deletes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws PortalException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
			deleteAccoNonHotelLicence(long accoNonHotelLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.deleteAccoNonHotelLicence(
			accoNonHotelLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoNonHotelLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoNonHotelLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoNonHotelLicenceLocalService.dynamicQuery();
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

		return _accoNonHotelLicenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
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

		return _accoNonHotelLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
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

		return _accoNonHotelLicenceLocalService.dynamicQuery(
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

		return _accoNonHotelLicenceLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accoNonHotelLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		fetchAccoNonHotelLicence(long accoNonHotelLicenceId) {

		return _accoNonHotelLicenceLocalService.fetchAccoNonHotelLicence(
			accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco non hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		fetchAccoNonHotelLicenceByUuidAndGroupId(String uuid, long groupId) {

		return _accoNonHotelLicenceLocalService.
			fetchAccoNonHotelLicenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel licence with the primary key.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws PortalException if a acco non hotel licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
			getAccoNonHotelLicence(long accoNonHotelLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.getAccoNonHotelLicence(
			accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco non hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel licence
	 * @throws PortalException if a matching acco non hotel licence could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
			getAccoNonHotelLicenceByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.
			getAccoNonHotelLicenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of acco non hotel licences
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelLicence>
			getAccoNonHotelLicences(int start, int end) {

		return _accoNonHotelLicenceLocalService.getAccoNonHotelLicences(
			start, end);
	}

	/**
	 * Returns all the acco non hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel licences
	 * @param companyId the primary key of the company
	 * @return the matching acco non hotel licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelLicence>
			getAccoNonHotelLicencesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accoNonHotelLicenceLocalService.
			getAccoNonHotelLicencesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acco non hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel licences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco non hotel licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelLicence>
			getAccoNonHotelLicencesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.
						AccoNonHotelLicence> orderByComparator) {

		return _accoNonHotelLicenceLocalService.
			getAccoNonHotelLicencesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco non hotel licences.
	 *
	 * @return the number of acco non hotel licences
	 */
	@Override
	public int getAccoNonHotelLicencesCount() {
		return _accoNonHotelLicenceLocalService.getAccoNonHotelLicencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoNonHotelLicenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accoNonHotelLicenceLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoNonHotelLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return _accoNonHotelLicenceLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelLicenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acco non hotel licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 * @return the acco non hotel licence that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
		updateAccoNonHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoNonHotelLicence
				accoNonHotelLicence) {

		return _accoNonHotelLicenceLocalService.updateAccoNonHotelLicence(
			accoNonHotelLicence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoNonHotelLicenceLocalService.getBasePersistence();
	}

	@Override
	public AccoNonHotelLicenceLocalService getWrappedService() {
		return _accoNonHotelLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelLicenceLocalService accoNonHotelLicenceLocalService) {

		_accoNonHotelLicenceLocalService = accoNonHotelLicenceLocalService;
	}

	private AccoNonHotelLicenceLocalService _accoNonHotelLicenceLocalService;

}