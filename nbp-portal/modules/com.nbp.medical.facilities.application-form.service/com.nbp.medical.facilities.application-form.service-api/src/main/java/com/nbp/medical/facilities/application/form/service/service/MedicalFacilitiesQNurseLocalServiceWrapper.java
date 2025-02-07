/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesQNurseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseLocalService
 * @generated
 */
public class MedicalFacilitiesQNurseLocalServiceWrapper
	implements MedicalFacilitiesQNurseLocalService,
			   ServiceWrapper<MedicalFacilitiesQNurseLocalService> {

	public MedicalFacilitiesQNurseLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesQNurseLocalServiceWrapper(
		MedicalFacilitiesQNurseLocalService
			medicalFacilitiesQNurseLocalService) {

		_medicalFacilitiesQNurseLocalService =
			medicalFacilitiesQNurseLocalService;
	}

	/**
	 * Adds the medical facilities q nurse to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesQNurseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesQNurse the medical facilities q nurse
	 * @return the medical facilities q nurse that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse addMedicalFacilitiesQNurse(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		return _medicalFacilitiesQNurseLocalService.addMedicalFacilitiesQNurse(
			medicalFacilitiesQNurse);
	}

	/**
	 * Creates a new medical facilities q nurse with the primary key. Does not add the medical facilities q nurse to the database.
	 *
	 * @param medicalFacilitiesQNurseId the primary key for the new medical facilities q nurse
	 * @return the new medical facilities q nurse
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse createMedicalFacilitiesQNurse(
			long medicalFacilitiesQNurseId) {

		return _medicalFacilitiesQNurseLocalService.
			createMedicalFacilitiesQNurse(medicalFacilitiesQNurseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities q nurse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesQNurseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse that was removed
	 * @throws PortalException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse deleteMedicalFacilitiesQNurse(
				long medicalFacilitiesQNurseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.
			deleteMedicalFacilitiesQNurse(medicalFacilitiesQNurseId);
	}

	/**
	 * Deletes the medical facilities q nurse from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesQNurseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesQNurse the medical facilities q nurse
	 * @return the medical facilities q nurse that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse deleteMedicalFacilitiesQNurse(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		return _medicalFacilitiesQNurseLocalService.
			deleteMedicalFacilitiesQNurse(medicalFacilitiesQNurse);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesQNurseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesQNurseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesQNurseLocalService.dynamicQuery();
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

		return _medicalFacilitiesQNurseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseModelImpl</code>.
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

		return _medicalFacilitiesQNurseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseModelImpl</code>.
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

		return _medicalFacilitiesQNurseLocalService.dynamicQuery(
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

		return _medicalFacilitiesQNurseLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesQNurseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse fetchMedicalFacilitiesQNurse(
			long medicalFacilitiesQNurseId) {

		return _medicalFacilitiesQNurseLocalService.
			fetchMedicalFacilitiesQNurse(medicalFacilitiesQNurseId);
	}

	/**
	 * Returns the medical facilities q nurse matching the UUID and group.
	 *
	 * @param uuid the medical facilities q nurse's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse fetchMedicalFacilitiesQNurseByUuidAndGroupId(
			String uuid, long groupId) {

		return _medicalFacilitiesQNurseLocalService.
			fetchMedicalFacilitiesQNurseByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesQNurseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesQNurseLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesQNurseLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse getMedicalFacilitiesById(long applicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFacilitiesQNurseException {

		return _medicalFacilitiesQNurseLocalService.getMedicalFacilitiesById(
			applicationId);
	}

	/**
	 * Returns the medical facilities q nurse with the primary key.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse
	 * @throws PortalException if a medical facilities q nurse with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse getMedicalFacilitiesQNurse(
				long medicalFacilitiesQNurseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.getMedicalFacilitiesQNurse(
			medicalFacilitiesQNurseId);
	}

	/**
	 * Returns the medical facilities q nurse matching the UUID and group.
	 *
	 * @param uuid the medical facilities q nurse's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities q nurse
	 * @throws PortalException if a matching medical facilities q nurse could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse getMedicalFacilitiesQNurseByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.
			getMedicalFacilitiesQNurseByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of medical facilities q nurses
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesQNurse> getMedicalFacilitiesQNurses(
				int start, int end) {

		return _medicalFacilitiesQNurseLocalService.getMedicalFacilitiesQNurses(
			start, end);
	}

	/**
	 * Returns all the medical facilities q nurses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities q nurses
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities q nurses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesQNurse>
				getMedicalFacilitiesQNursesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesQNurseLocalService.
			getMedicalFacilitiesQNursesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities q nurses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities q nurses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities q nurses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesQNurse>
				getMedicalFacilitiesQNursesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesQNurse> orderByComparator) {

		return _medicalFacilitiesQNurseLocalService.
			getMedicalFacilitiesQNursesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities q nurses.
	 *
	 * @return the number of medical facilities q nurses
	 */
	@Override
	public int getMedicalFacilitiesQNursesCount() {
		return _medicalFacilitiesQNurseLocalService.
			getMedicalFacilitiesQNursesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesQNurseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesQNurseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities q nurse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesQNurseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesQNurse the medical facilities q nurse
	 * @return the medical facilities q nurse that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesQNurse updateMedicalFacilitiesQNurse(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		return _medicalFacilitiesQNurseLocalService.
			updateMedicalFacilitiesQNurse(medicalFacilitiesQNurse);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesQNurseLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesQNurseLocalService getWrappedService() {
		return _medicalFacilitiesQNurseLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesQNurseLocalService
			medicalFacilitiesQNurseLocalService) {

		_medicalFacilitiesQNurseLocalService =
			medicalFacilitiesQNurseLocalService;
	}

	private MedicalFacilitiesQNurseLocalService
		_medicalFacilitiesQNurseLocalService;

}