/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesMaterHomeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHomeLocalService
 * @generated
 */
public class MedicalFacilitiesMaterHomeLocalServiceWrapper
	implements MedicalFacilitiesMaterHomeLocalService,
			   ServiceWrapper<MedicalFacilitiesMaterHomeLocalService> {

	public MedicalFacilitiesMaterHomeLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesMaterHomeLocalServiceWrapper(
		MedicalFacilitiesMaterHomeLocalService
			medicalFacilitiesMaterHomeLocalService) {

		_medicalFacilitiesMaterHomeLocalService =
			medicalFacilitiesMaterHomeLocalService;
	}

	/**
	 * Adds the medical facilities mater home to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesMaterHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 * @return the medical facilities mater home that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome addMedicalFacilitiesMaterHome(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return _medicalFacilitiesMaterHomeLocalService.
			addMedicalFacilitiesMaterHome(medicalFacilitiesMaterHome);
	}

	/**
	 * Creates a new medical facilities mater home with the primary key. Does not add the medical facilities mater home to the database.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key for the new medical facilities mater home
	 * @return the new medical facilities mater home
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome createMedicalFacilitiesMaterHome(
			long medicalFacilitiesMaterHomeId) {

		return _medicalFacilitiesMaterHomeLocalService.
			createMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities mater home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesMaterHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 * @throws PortalException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome deleteMedicalFacilitiesMaterHome(
				long medicalFacilitiesMaterHomeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.
			deleteMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Deletes the medical facilities mater home from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesMaterHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome deleteMedicalFacilitiesMaterHome(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return _medicalFacilitiesMaterHomeLocalService.
			deleteMedicalFacilitiesMaterHome(medicalFacilitiesMaterHome);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesMaterHomeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesMaterHomeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesMaterHomeLocalService.dynamicQuery();
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

		return _medicalFacilitiesMaterHomeLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesMaterHomeModelImpl</code>.
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

		return _medicalFacilitiesMaterHomeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesMaterHomeModelImpl</code>.
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

		return _medicalFacilitiesMaterHomeLocalService.dynamicQuery(
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

		return _medicalFacilitiesMaterHomeLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesMaterHomeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome fetchMedicalFacilitiesMaterHome(
			long medicalFacilitiesMaterHomeId) {

		return _medicalFacilitiesMaterHomeLocalService.
			fetchMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns the medical facilities mater home matching the UUID and group.
	 *
	 * @param uuid the medical facilities mater home's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome
			fetchMedicalFacilitiesMaterHomeByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesMaterHomeLocalService.
			fetchMedicalFacilitiesMaterHomeByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesMaterHomeLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesMaterHomeLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesMaterHomeLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesMaterHome> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities mater home with the primary key.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home
	 * @throws PortalException if a medical facilities mater home with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome getMedicalFacilitiesMaterHome(
				long medicalFacilitiesMaterHomeId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns the medical facilities mater home matching the UUID and group.
	 *
	 * @param uuid the medical facilities mater home's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities mater home
	 * @throws PortalException if a matching medical facilities mater home could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome
				getMedicalFacilitiesMaterHomeByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHomeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of medical facilities mater homes
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesMaterHome> getMedicalFacilitiesMaterHomes(
				int start, int end) {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHomes(start, end);
	}

	/**
	 * Returns all the medical facilities mater homes matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities mater homes
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities mater homes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesMaterHome>
				getMedicalFacilitiesMaterHomesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHomesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities mater homes matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities mater homes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities mater homes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesMaterHome>
				getMedicalFacilitiesMaterHomesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesMaterHome>
								orderByComparator) {

		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHomesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities mater homes.
	 *
	 * @return the number of medical facilities mater homes
	 */
	@Override
	public int getMedicalFacilitiesMaterHomesCount() {
		return _medicalFacilitiesMaterHomeLocalService.
			getMedicalFacilitiesMaterHomesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesMaterHomeLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesMaterHomeLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities mater home in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesMaterHomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 * @return the medical facilities mater home that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesMaterHome updateMedicalFacilitiesMaterHome(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return _medicalFacilitiesMaterHomeLocalService.
			updateMedicalFacilitiesMaterHome(medicalFacilitiesMaterHome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesMaterHomeLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesMaterHomeLocalService getWrappedService() {
		return _medicalFacilitiesMaterHomeLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesMaterHomeLocalService
			medicalFacilitiesMaterHomeLocalService) {

		_medicalFacilitiesMaterHomeLocalService =
			medicalFacilitiesMaterHomeLocalService;
	}

	private MedicalFacilitiesMaterHomeLocalService
		_medicalFacilitiesMaterHomeLocalService;

}