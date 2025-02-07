/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoHomeStayLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayLocalService
 * @generated
 */
public class AccoHomeStayLocalServiceWrapper
	implements AccoHomeStayLocalService,
			   ServiceWrapper<AccoHomeStayLocalService> {

	public AccoHomeStayLocalServiceWrapper() {
		this(null);
	}

	public AccoHomeStayLocalServiceWrapper(
		AccoHomeStayLocalService accoHomeStayLocalService) {

		_accoHomeStayLocalService = accoHomeStayLocalService;
	}

	/**
	 * Adds the acco home stay to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		addAccoHomeStay(
			com.nbp.jtb.application.form.service.model.AccoHomeStay
				accoHomeStay) {

		return _accoHomeStayLocalService.addAccoHomeStay(accoHomeStay);
	}

	/**
	 * Creates a new acco home stay with the primary key. Does not add the acco home stay to the database.
	 *
	 * @param accoHomeStayId the primary key for the new acco home stay
	 * @return the new acco home stay
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		createAccoHomeStay(long accoHomeStayId) {

		return _accoHomeStayLocalService.createAccoHomeStay(accoHomeStayId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acco home stay from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		deleteAccoHomeStay(
			com.nbp.jtb.application.form.service.model.AccoHomeStay
				accoHomeStay) {

		return _accoHomeStayLocalService.deleteAccoHomeStay(accoHomeStay);
	}

	/**
	 * Deletes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws PortalException if a acco home stay with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
			deleteAccoHomeStay(long accoHomeStayId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.deleteAccoHomeStay(accoHomeStayId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoHomeStayLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoHomeStayLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoHomeStayLocalService.dynamicQuery();
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

		return _accoHomeStayLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
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

		return _accoHomeStayLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
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

		return _accoHomeStayLocalService.dynamicQuery(
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

		return _accoHomeStayLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accoHomeStayLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		fetchAccoHomeStay(long accoHomeStayId) {

		return _accoHomeStayLocalService.fetchAccoHomeStay(accoHomeStayId);
	}

	/**
	 * Returns the acco home stay matching the UUID and group.
	 *
	 * @param uuid the acco home stay's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		fetchAccoHomeStayByUuidAndGroupId(String uuid, long groupId) {

		return _accoHomeStayLocalService.fetchAccoHomeStayByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acco home stay with the primary key.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws PortalException if a acco home stay with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
			getAccoHomeStay(long accoHomeStayId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.getAccoHomeStay(accoHomeStayId);
	}

	/**
	 * Returns the acco home stay matching the UUID and group.
	 *
	 * @param uuid the acco home stay's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco home stay
	 * @throws PortalException if a matching acco home stay could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
			getAccoHomeStayByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.getAccoHomeStayByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of acco home stays
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHomeStay>
			getAccoHomeStays(int start, int end) {

		return _accoHomeStayLocalService.getAccoHomeStays(start, end);
	}

	/**
	 * Returns all the acco home stays matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco home stays
	 * @param companyId the primary key of the company
	 * @return the matching acco home stays, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHomeStay>
			getAccoHomeStaysByUuidAndCompanyId(String uuid, long companyId) {

		return _accoHomeStayLocalService.getAccoHomeStaysByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acco home stays matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco home stays
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco home stays, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoHomeStay>
			getAccoHomeStaysByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.AccoHomeStay>
						orderByComparator) {

		return _accoHomeStayLocalService.getAccoHomeStaysByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco home stays.
	 *
	 * @return the number of acco home stays
	 */
	@Override
	public int getAccoHomeStaysCount() {
		return _accoHomeStayLocalService.getAccoHomeStaysCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoHomeStayLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accoHomeStayLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoHomeStayLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return _accoHomeStayLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoHomeStayLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoHomeStayLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acco home stay in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoHomeStayLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoHomeStay the acco home stay
	 * @return the acco home stay that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoHomeStay
		updateAccoHomeStay(
			com.nbp.jtb.application.form.service.model.AccoHomeStay
				accoHomeStay) {

		return _accoHomeStayLocalService.updateAccoHomeStay(accoHomeStay);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoHomeStayLocalService.getBasePersistence();
	}

	@Override
	public AccoHomeStayLocalService getWrappedService() {
		return _accoHomeStayLocalService;
	}

	@Override
	public void setWrappedService(
		AccoHomeStayLocalService accoHomeStayLocalService) {

		_accoHomeStayLocalService = accoHomeStayLocalService;
	}

	private AccoHomeStayLocalService _accoHomeStayLocalService;

}