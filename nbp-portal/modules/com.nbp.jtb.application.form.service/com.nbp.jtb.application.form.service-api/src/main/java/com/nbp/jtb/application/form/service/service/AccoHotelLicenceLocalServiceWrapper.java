/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoHotelLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHotelLicenceLocalService
 * @generated
 */
public class AccoHotelLicenceLocalServiceWrapper
	implements AccoHotelLicenceLocalService,
			   ServiceWrapper<AccoHotelLicenceLocalService> {

	public AccoHotelLicenceLocalServiceWrapper() {
		this(null);
	}

	public AccoHotelLicenceLocalServiceWrapper(
		AccoHotelLicenceLocalService accoHotelLicenceLocalService) {

		_accoHotelLicenceLocalService = accoHotelLicenceLocalService;
	}

	/**
	 * Adds the acco hotel licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHotelLicence the acco hotel licence
	 * @return the acco hotel licence that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		addAccoHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoHotelLicence
				accoHotelLicence) {

		return _accoHotelLicenceLocalService.addAccoHotelLicence(
			accoHotelLicence);
	}

	/**
	 * Creates a new acco hotel licence with the primary key. Does not add the acco hotel licence to the database.
	 *
	 * @param accoHotelLicenceId the primary key for the new acco hotel licence
	 * @return the new acco hotel licence
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		createAccoHotelLicence(long accoHotelLicenceId) {

		return _accoHotelLicenceLocalService.createAccoHotelLicence(
			accoHotelLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acco hotel licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHotelLicence the acco hotel licence
	 * @return the acco hotel licence that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		deleteAccoHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoHotelLicence
				accoHotelLicence) {

		return _accoHotelLicenceLocalService.deleteAccoHotelLicence(
			accoHotelLicence);
	}

	/**
	 * Deletes the acco hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence that was removed
	 * @throws PortalException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
			deleteAccoHotelLicence(long accoHotelLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.deleteAccoHotelLicence(
			accoHotelLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoHotelLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoHotelLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoHotelLicenceLocalService.dynamicQuery();
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

		return _accoHotelLicenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHotelLicenceModelImpl</code>.
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

		return _accoHotelLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHotelLicenceModelImpl</code>.
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

		return _accoHotelLicenceLocalService.dynamicQuery(
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

		return _accoHotelLicenceLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accoHotelLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		fetchAccoHotelLicence(long accoHotelLicenceId) {

		return _accoHotelLicenceLocalService.fetchAccoHotelLicence(
			accoHotelLicenceId);
	}

	/**
	 * Returns the acco hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		fetchAccoHotelLicenceByUuidAndGroupId(String uuid, long groupId) {

		return _accoHotelLicenceLocalService.
			fetchAccoHotelLicenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acco hotel licence with the primary key.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence
	 * @throws PortalException if a acco hotel licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
			getAccoHotelLicence(long accoHotelLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.getAccoHotelLicence(
			accoHotelLicenceId);
	}

	/**
	 * Returns the acco hotel licence matching the UUID and group.
	 *
	 * @param uuid the acco hotel licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco hotel licence
	 * @throws PortalException if a matching acco hotel licence could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
			getAccoHotelLicenceByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.
			getAccoHotelLicenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of acco hotel licences
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHotelLicence>
			getAccoHotelLicences(int start, int end) {

		return _accoHotelLicenceLocalService.getAccoHotelLicences(start, end);
	}

	/**
	 * Returns all the acco hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco hotel licences
	 * @param companyId the primary key of the company
	 * @return the matching acco hotel licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHotelLicence>
			getAccoHotelLicencesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accoHotelLicenceLocalService.
			getAccoHotelLicencesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acco hotel licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco hotel licences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco hotel licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHotelLicence>
			getAccoHotelLicencesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.
						AccoHotelLicence> orderByComparator) {

		return _accoHotelLicenceLocalService.
			getAccoHotelLicencesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco hotel licences.
	 *
	 * @return the number of acco hotel licences
	 */
	@Override
	public int getAccoHotelLicencesCount() {
		return _accoHotelLicenceLocalService.getAccoHotelLicencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoHotelLicenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accoHotelLicenceLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoHotelLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHotelLicenceException {

		return _accoHotelLicenceLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoHotelLicenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHotelLicenceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acco hotel licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHotelLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHotelLicence the acco hotel licence
	 * @return the acco hotel licence that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHotelLicence
		updateAccoHotelLicence(
			com.nbp.jtb.application.form.service.model.AccoHotelLicence
				accoHotelLicence) {

		return _accoHotelLicenceLocalService.updateAccoHotelLicence(
			accoHotelLicence);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoHotelLicenceLocalService.getBasePersistence();
	}

	@Override
	public AccoHotelLicenceLocalService getWrappedService() {
		return _accoHotelLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		AccoHotelLicenceLocalService accoHotelLicenceLocalService) {

		_accoHotelLicenceLocalService = accoHotelLicenceLocalService;
	}

	private AccoHotelLicenceLocalService _accoHotelLicenceLocalService;

}