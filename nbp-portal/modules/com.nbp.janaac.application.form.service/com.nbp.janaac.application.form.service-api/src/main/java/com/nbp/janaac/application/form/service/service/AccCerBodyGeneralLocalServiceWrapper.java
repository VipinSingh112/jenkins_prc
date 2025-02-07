/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyGeneralLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyGeneralLocalService
 * @generated
 */
public class AccCerBodyGeneralLocalServiceWrapper
	implements AccCerBodyGeneralLocalService,
			   ServiceWrapper<AccCerBodyGeneralLocalService> {

	public AccCerBodyGeneralLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyGeneralLocalServiceWrapper(
		AccCerBodyGeneralLocalService accCerBodyGeneralLocalService) {

		_accCerBodyGeneralLocalService = accCerBodyGeneralLocalService;
	}

	/**
	 * Adds the acc cer body general to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyGeneralLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyGeneral the acc cer body general
	 * @return the acc cer body general that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		addAccCerBodyGeneral(
			com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
				accCerBodyGeneral) {

		return _accCerBodyGeneralLocalService.addAccCerBodyGeneral(
			accCerBodyGeneral);
	}

	/**
	 * Creates a new acc cer body general with the primary key. Does not add the acc cer body general to the database.
	 *
	 * @param accCerBodyGeneralId the primary key for the new acc cer body general
	 * @return the new acc cer body general
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		createAccCerBodyGeneral(long accCerBodyGeneralId) {

		return _accCerBodyGeneralLocalService.createAccCerBodyGeneral(
			accCerBodyGeneralId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body general from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyGeneralLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyGeneral the acc cer body general
	 * @return the acc cer body general that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		deleteAccCerBodyGeneral(
			com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
				accCerBodyGeneral) {

		return _accCerBodyGeneralLocalService.deleteAccCerBodyGeneral(
			accCerBodyGeneral);
	}

	/**
	 * Deletes the acc cer body general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyGeneralLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyGeneralId the primary key of the acc cer body general
	 * @return the acc cer body general that was removed
	 * @throws PortalException if a acc cer body general with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
			deleteAccCerBodyGeneral(long accCerBodyGeneralId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.deleteAccCerBodyGeneral(
			accCerBodyGeneralId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyGeneralLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyGeneralLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyGeneralLocalService.dynamicQuery();
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

		return _accCerBodyGeneralLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyGeneralModelImpl</code>.
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

		return _accCerBodyGeneralLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyGeneralModelImpl</code>.
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

		return _accCerBodyGeneralLocalService.dynamicQuery(
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

		return _accCerBodyGeneralLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accCerBodyGeneralLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		fetchAccCerBodyGeneral(long accCerBodyGeneralId) {

		return _accCerBodyGeneralLocalService.fetchAccCerBodyGeneral(
			accCerBodyGeneralId);
	}

	/**
	 * Returns the acc cer body general matching the UUID and group.
	 *
	 * @param uuid the acc cer body general's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body general, or <code>null</code> if a matching acc cer body general could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		fetchAccCerBodyGeneralByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyGeneralLocalService.
			fetchAccCerBodyGeneralByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body general with the primary key.
	 *
	 * @param accCerBodyGeneralId the primary key of the acc cer body general
	 * @return the acc cer body general
	 * @throws PortalException if a acc cer body general with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
			getAccCerBodyGeneral(long accCerBodyGeneralId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.getAccCerBodyGeneral(
			accCerBodyGeneralId);
	}

	/**
	 * Returns the acc cer body general matching the UUID and group.
	 *
	 * @param uuid the acc cer body general's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body general
	 * @throws PortalException if a matching acc cer body general could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
			getAccCerBodyGeneralByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.
			getAccCerBodyGeneralByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyGeneralModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @return the range of acc cer body generals
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyGeneral>
			getAccCerBodyGenerals(int start, int end) {

		return _accCerBodyGeneralLocalService.getAccCerBodyGenerals(start, end);
	}

	/**
	 * Returns all the acc cer body generals matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body generals
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body generals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyGeneral>
			getAccCerBodyGeneralsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accCerBodyGeneralLocalService.
			getAccCerBodyGeneralsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body generals matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body generals
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body generals
	 * @param end the upper bound of the range of acc cer body generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body generals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyGeneral>
			getAccCerBodyGeneralsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyGeneral> orderByComparator) {

		return _accCerBodyGeneralLocalService.
			getAccCerBodyGeneralsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body generals.
	 *
	 * @return the number of acc cer body generals
	 */
	@Override
	public int getAccCerBodyGeneralsCount() {
		return _accCerBodyGeneralLocalService.getAccCerBodyGeneralsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyGeneralLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyGeneralLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyGeneralLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyGeneralException {

		return _accCerBodyGeneralLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyGeneralLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyGeneralLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acc cer body general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyGeneralLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyGeneral the acc cer body general
	 * @return the acc cer body general that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
		updateAccCerBodyGeneral(
			com.nbp.janaac.application.form.service.model.AccCerBodyGeneral
				accCerBodyGeneral) {

		return _accCerBodyGeneralLocalService.updateAccCerBodyGeneral(
			accCerBodyGeneral);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyGeneralLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyGeneralLocalService getWrappedService() {
		return _accCerBodyGeneralLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyGeneralLocalService accCerBodyGeneralLocalService) {

		_accCerBodyGeneralLocalService = accCerBodyGeneralLocalService;
	}

	private AccCerBodyGeneralLocalService _accCerBodyGeneralLocalService;

}