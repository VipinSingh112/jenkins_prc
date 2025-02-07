/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesHomeTwoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwoLocalService
 * @generated
 */
public class MedicalFacilitiesHomeTwoLocalServiceWrapper
	implements MedicalFacilitiesHomeTwoLocalService,
			   ServiceWrapper<MedicalFacilitiesHomeTwoLocalService> {

	public MedicalFacilitiesHomeTwoLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesHomeTwoLocalServiceWrapper(
		MedicalFacilitiesHomeTwoLocalService
			medicalFacilitiesHomeTwoLocalService) {

		_medicalFacilitiesHomeTwoLocalService =
			medicalFacilitiesHomeTwoLocalService;
	}

	/**
	 * Adds the medical facilities home two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo addMedicalFacilitiesHomeTwo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return _medicalFacilitiesHomeTwoLocalService.
			addMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwo);
	}

	/**
	 * Creates a new medical facilities home two with the primary key. Does not add the medical facilities home two to the database.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key for the new medical facilities home two
	 * @return the new medical facilities home two
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo createMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId) {

		return _medicalFacilitiesHomeTwoLocalService.
			createMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities home two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two that was removed
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
				long medicalFacilitiesHomeTwoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.
			deleteMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
	}

	/**
	 * Deletes the medical facilities home two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return _medicalFacilitiesHomeTwoLocalService.
			deleteMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesHomeTwoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesHomeTwoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesHomeTwoLocalService.dynamicQuery();
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

		return _medicalFacilitiesHomeTwoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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

		return _medicalFacilitiesHomeTwoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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

		return _medicalFacilitiesHomeTwoLocalService.dynamicQuery(
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

		return _medicalFacilitiesHomeTwoLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesHomeTwoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo fetchMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId) {

		return _medicalFacilitiesHomeTwoLocalService.
			fetchMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId) {

		return _medicalFacilitiesHomeTwoLocalService.
			fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesHomeTwoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesHomeTwoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesHomeTwoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeTwo> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities home two with the primary key.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwo(
				long medicalFacilitiesHomeTwoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two
	 * @throws PortalException if a matching medical facilities home two could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwoByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of medical facilities home twos
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeTwo> getMedicalFacilitiesHomeTwos(
				int start, int end) {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwos(start, end);
	}

	/**
	 * Returns all the medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeTwo>
				getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeTwo>
				getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesHomeTwo> orderByComparator) {

		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities home twos.
	 *
	 * @return the number of medical facilities home twos
	 */
	@Override
	public int getMedicalFacilitiesHomeTwosCount() {
		return _medicalFacilitiesHomeTwoLocalService.
			getMedicalFacilitiesHomeTwosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesHomeTwoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeTwoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities home two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeTwo updateMedicalFacilitiesHomeTwo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return _medicalFacilitiesHomeTwoLocalService.
			updateMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesHomeTwoLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesHomeTwoLocalService getWrappedService() {
		return _medicalFacilitiesHomeTwoLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesHomeTwoLocalService
			medicalFacilitiesHomeTwoLocalService) {

		_medicalFacilitiesHomeTwoLocalService =
			medicalFacilitiesHomeTwoLocalService;
	}

	private MedicalFacilitiesHomeTwoLocalService
		_medicalFacilitiesHomeTwoLocalService;

}