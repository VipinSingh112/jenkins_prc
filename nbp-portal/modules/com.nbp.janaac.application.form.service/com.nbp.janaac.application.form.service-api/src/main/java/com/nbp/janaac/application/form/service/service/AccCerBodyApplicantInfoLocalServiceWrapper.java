/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyApplicantInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfoLocalService
 * @generated
 */
public class AccCerBodyApplicantInfoLocalServiceWrapper
	implements AccCerBodyApplicantInfoLocalService,
			   ServiceWrapper<AccCerBodyApplicantInfoLocalService> {

	public AccCerBodyApplicantInfoLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyApplicantInfoLocalServiceWrapper(
		AccCerBodyApplicantInfoLocalService
			accCerBodyApplicantInfoLocalService) {

		_accCerBodyApplicantInfoLocalService =
			accCerBodyApplicantInfoLocalService;
	}

	/**
	 * Adds the acc cer body applicant info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyApplicantInfo the acc cer body applicant info
	 * @return the acc cer body applicant info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		addAccCerBodyApplicantInfo(
			com.nbp.janaac.application.form.service.model.
				AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

		return _accCerBodyApplicantInfoLocalService.addAccCerBodyApplicantInfo(
			accCerBodyApplicantInfo);
	}

	/**
	 * Creates a new acc cer body applicant info with the primary key. Does not add the acc cer body applicant info to the database.
	 *
	 * @param accCerBodyApplicantInfoId the primary key for the new acc cer body applicant info
	 * @return the new acc cer body applicant info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		createAccCerBodyApplicantInfo(long accCerBodyApplicantInfoId) {

		return _accCerBodyApplicantInfoLocalService.
			createAccCerBodyApplicantInfo(accCerBodyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body applicant info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyApplicantInfo the acc cer body applicant info
	 * @return the acc cer body applicant info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		deleteAccCerBodyApplicantInfo(
			com.nbp.janaac.application.form.service.model.
				AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

		return _accCerBodyApplicantInfoLocalService.
			deleteAccCerBodyApplicantInfo(accCerBodyApplicantInfo);
	}

	/**
	 * Deletes the acc cer body applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the acc cer body applicant info
	 * @return the acc cer body applicant info that was removed
	 * @throws PortalException if a acc cer body applicant info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
			deleteAccCerBodyApplicantInfo(long accCerBodyApplicantInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.
			deleteAccCerBodyApplicantInfo(accCerBodyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyApplicantInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyApplicantInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyApplicantInfoLocalService.dynamicQuery();
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

		return _accCerBodyApplicantInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyApplicantInfoModelImpl</code>.
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

		return _accCerBodyApplicantInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyApplicantInfoModelImpl</code>.
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

		return _accCerBodyApplicantInfoLocalService.dynamicQuery(
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

		return _accCerBodyApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _accCerBodyApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		fetchAccCerBodyApplicantInfo(long accCerBodyApplicantInfoId) {

		return _accCerBodyApplicantInfoLocalService.
			fetchAccCerBodyApplicantInfo(accCerBodyApplicantInfoId);
	}

	/**
	 * Returns the acc cer body applicant info matching the UUID and group.
	 *
	 * @param uuid the acc cer body applicant info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body applicant info, or <code>null</code> if a matching acc cer body applicant info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		fetchAccCerBodyApplicantInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return _accCerBodyApplicantInfoLocalService.
			fetchAccCerBodyApplicantInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body applicant info with the primary key.
	 *
	 * @param accCerBodyApplicantInfoId the primary key of the acc cer body applicant info
	 * @return the acc cer body applicant info
	 * @throws PortalException if a acc cer body applicant info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
			getAccCerBodyApplicantInfo(long accCerBodyApplicantInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.getAccCerBodyApplicantInfo(
			accCerBodyApplicantInfoId);
	}

	/**
	 * Returns the acc cer body applicant info matching the UUID and group.
	 *
	 * @param uuid the acc cer body applicant info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body applicant info
	 * @throws PortalException if a matching acc cer body applicant info could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
			getAccCerBodyApplicantInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.
			getAccCerBodyApplicantInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @return the range of acc cer body applicant infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo>
			getAccCerBodyApplicantInfos(int start, int end) {

		return _accCerBodyApplicantInfoLocalService.getAccCerBodyApplicantInfos(
			start, end);
	}

	/**
	 * Returns all the acc cer body applicant infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body applicant infos
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body applicant infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo>
			getAccCerBodyApplicantInfosByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accCerBodyApplicantInfoLocalService.
			getAccCerBodyApplicantInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body applicant infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body applicant infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body applicant infos
	 * @param end the upper bound of the range of acc cer body applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body applicant infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo>
			getAccCerBodyApplicantInfosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyApplicantInfo> orderByComparator) {

		return _accCerBodyApplicantInfoLocalService.
			getAccCerBodyApplicantInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body applicant infos.
	 *
	 * @return the number of acc cer body applicant infos
	 */
	@Override
	public int getAccCerBodyApplicantInfosCount() {
		return _accCerBodyApplicantInfoLocalService.
			getAccCerBodyApplicantInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyApplicantInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyApplicantInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyApplicantInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyApplicantInfoException {

		return _accCerBodyApplicantInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyApplicantInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyApplicantInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc cer body applicant info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyApplicantInfo the acc cer body applicant info
	 * @return the acc cer body applicant info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo
		updateAccCerBodyApplicantInfo(
			com.nbp.janaac.application.form.service.model.
				AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

		return _accCerBodyApplicantInfoLocalService.
			updateAccCerBodyApplicantInfo(accCerBodyApplicantInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyApplicantInfoLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyApplicantInfoLocalService getWrappedService() {
		return _accCerBodyApplicantInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyApplicantInfoLocalService
			accCerBodyApplicantInfoLocalService) {

		_accCerBodyApplicantInfoLocalService =
			accCerBodyApplicantInfoLocalService;
	}

	private AccCerBodyApplicantInfoLocalService
		_accCerBodyApplicantInfoLocalService;

}