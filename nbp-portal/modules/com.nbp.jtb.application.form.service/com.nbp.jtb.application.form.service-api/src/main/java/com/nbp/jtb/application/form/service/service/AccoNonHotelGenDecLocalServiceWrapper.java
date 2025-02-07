/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoNonHotelGenDecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDecLocalService
 * @generated
 */
public class AccoNonHotelGenDecLocalServiceWrapper
	implements AccoNonHotelGenDecLocalService,
			   ServiceWrapper<AccoNonHotelGenDecLocalService> {

	public AccoNonHotelGenDecLocalServiceWrapper() {
		this(null);
	}

	public AccoNonHotelGenDecLocalServiceWrapper(
		AccoNonHotelGenDecLocalService accoNonHotelGenDecLocalService) {

		_accoNonHotelGenDecLocalService = accoNonHotelGenDecLocalService;
	}

	/**
	 * Adds the acco non hotel gen dec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		addAccoNonHotelGenDec(
			com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
				accoNonHotelGenDec) {

		return _accoNonHotelGenDecLocalService.addAccoNonHotelGenDec(
			accoNonHotelGenDec);
	}

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		createAccoNonHotelGenDec(long accoNonHotelGenDecId) {

		return _accoNonHotelGenDecLocalService.createAccoNonHotelGenDec(
			accoNonHotelGenDecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acco non hotel gen dec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		deleteAccoNonHotelGenDec(
			com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
				accoNonHotelGenDec) {

		return _accoNonHotelGenDecLocalService.deleteAccoNonHotelGenDec(
			accoNonHotelGenDec);
	}

	/**
	 * Deletes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
			deleteAccoNonHotelGenDec(long accoNonHotelGenDecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.deleteAccoNonHotelGenDec(
			accoNonHotelGenDecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoNonHotelGenDecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoNonHotelGenDecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoNonHotelGenDecLocalService.dynamicQuery();
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

		return _accoNonHotelGenDecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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

		return _accoNonHotelGenDecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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

		return _accoNonHotelGenDecLocalService.dynamicQuery(
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

		return _accoNonHotelGenDecLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accoNonHotelGenDecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		fetchAccoNonHotelGenDec(long accoNonHotelGenDecId) {

		return _accoNonHotelGenDecLocalService.fetchAccoNonHotelGenDec(
			accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		fetchAccoNonHotelGenDecByUuidAndGroupId(String uuid, long groupId) {

		return _accoNonHotelGenDecLocalService.
			fetchAccoNonHotelGenDecByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
			getAccoNonHotelGenDec(long accoNonHotelGenDecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.getAccoNonHotelGenDec(
			accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec
	 * @throws PortalException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
			getAccoNonHotelGenDecByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.
			getAccoNonHotelGenDecByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec>
			getAccoNonHotelGenDecs(int start, int end) {

		return _accoNonHotelGenDecLocalService.getAccoNonHotelGenDecs(
			start, end);
	}

	/**
	 * Returns all the acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @return the matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec>
			getAccoNonHotelGenDecsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accoNonHotelGenDecLocalService.
			getAccoNonHotelGenDecsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec>
			getAccoNonHotelGenDecsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.
						AccoNonHotelGenDec> orderByComparator) {

		return _accoNonHotelGenDecLocalService.
			getAccoNonHotelGenDecsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
	 */
	@Override
	public int getAccoNonHotelGenDecsCount() {
		return _accoNonHotelGenDecLocalService.getAccoNonHotelGenDecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoNonHotelGenDecLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accoNonHotelGenDecLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoNonHotelGenDecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return _accoNonHotelGenDecLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelGenDecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelGenDecLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acco non hotel gen dec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
		updateAccoNonHotelGenDec(
			com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec
				accoNonHotelGenDec) {

		return _accoNonHotelGenDecLocalService.updateAccoNonHotelGenDec(
			accoNonHotelGenDec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoNonHotelGenDecLocalService.getBasePersistence();
	}

	@Override
	public AccoNonHotelGenDecLocalService getWrappedService() {
		return _accoNonHotelGenDecLocalService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelGenDecLocalService accoNonHotelGenDecLocalService) {

		_accoNonHotelGenDecLocalService = accoNonHotelGenDecLocalService;
	}

	private AccoNonHotelGenDecLocalService _accoNonHotelGenDecLocalService;

}