/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalCertificateIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceLocalService
 * @generated
 */
public class MedicalCertificateIssuanceLocalServiceWrapper
	implements MedicalCertificateIssuanceLocalService,
			   ServiceWrapper<MedicalCertificateIssuanceLocalService> {

	public MedicalCertificateIssuanceLocalServiceWrapper() {
		this(null);
	}

	public MedicalCertificateIssuanceLocalServiceWrapper(
		MedicalCertificateIssuanceLocalService
			medicalCertificateIssuanceLocalService) {

		_medicalCertificateIssuanceLocalService =
			medicalCertificateIssuanceLocalService;
	}

	/**
	 * Adds the medical certificate issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was added
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		addMedicalCertificateIssuance(
			com.nbp.medical.stages.service.model.MedicalCertificateIssuance
				medicalCertificateIssuance) {

		return _medicalCertificateIssuanceLocalService.
			addMedicalCertificateIssuance(medicalCertificateIssuance);
	}

	/**
	 * Creates a new medical certificate issuance with the primary key. Does not add the medical certificate issuance to the database.
	 *
	 * @param medicalCertificateIssuanceId the primary key for the new medical certificate issuance
	 * @return the new medical certificate issuance
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		createMedicalCertificateIssuance(long medicalCertificateIssuanceId) {

		return _medicalCertificateIssuanceLocalService.
			createMedicalCertificateIssuance(medicalCertificateIssuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCertificateIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws PortalException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
			deleteMedicalCertificateIssuance(long medicalCertificateIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCertificateIssuanceLocalService.
			deleteMedicalCertificateIssuance(medicalCertificateIssuanceId);
	}

	/**
	 * Deletes the medical certificate issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		deleteMedicalCertificateIssuance(
			com.nbp.medical.stages.service.model.MedicalCertificateIssuance
				medicalCertificateIssuance) {

		return _medicalCertificateIssuanceLocalService.
			deleteMedicalCertificateIssuance(medicalCertificateIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCertificateIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalCertificateIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalCertificateIssuanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalCertificateIssuanceLocalService.dynamicQuery();
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

		return _medicalCertificateIssuanceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
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

		return _medicalCertificateIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
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

		return _medicalCertificateIssuanceLocalService.dynamicQuery(
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

		return _medicalCertificateIssuanceLocalService.dynamicQueryCount(
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

		return _medicalCertificateIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		fetchMedicalCertificateIssuance(long medicalCertificateIssuanceId) {

		return _medicalCertificateIssuanceLocalService.
			fetchMedicalCertificateIssuance(medicalCertificateIssuanceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalCertificateIssuanceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
			getCertificateIssuance(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return _medicalCertificateIssuanceLocalService.getCertificateIssuance(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalCertificateIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medical certificate issuance with the primary key.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws PortalException if a medical certificate issuance with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
			getMedicalCertificateIssuance(long medicalCertificateIssuanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCertificateIssuanceLocalService.
			getMedicalCertificateIssuance(medicalCertificateIssuanceId);
	}

	/**
	 * Returns a range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @return the range of medical certificate issuances
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalCertificateIssuance>
			getMedicalCertificateIssuances(int start, int end) {

		return _medicalCertificateIssuanceLocalService.
			getMedicalCertificateIssuances(start, end);
	}

	/**
	 * Returns the number of medical certificate issuances.
	 *
	 * @return the number of medical certificate issuances
	 */
	@Override
	public int getMedicalCertificateIssuancesCount() {
		return _medicalCertificateIssuanceLocalService.
			getMedicalCertificateIssuancesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalCertificateIssuanceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCertificateIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical certificate issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was updated
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		updateMedicalCertificateIssuance(
			com.nbp.medical.stages.service.model.MedicalCertificateIssuance
				medicalCertificateIssuance) {

		return _medicalCertificateIssuanceLocalService.
			updateMedicalCertificateIssuance(medicalCertificateIssuance);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalCertificateIssuance
		updateMedicalCertificateIssuance(
			String caseId, String status, String issuanceCertificate,
			String medicalCategory, java.util.Date dateOfCertificateIssuance,
			java.util.Date dateOfCertificateExpiration,
			long licenceFileEntryId) {

		return _medicalCertificateIssuanceLocalService.
			updateMedicalCertificateIssuance(
				caseId, status, issuanceCertificate, medicalCategory,
				dateOfCertificateIssuance, dateOfCertificateExpiration,
				licenceFileEntryId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalCertificateIssuanceLocalService.getBasePersistence();
	}

	@Override
	public MedicalCertificateIssuanceLocalService getWrappedService() {
		return _medicalCertificateIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalCertificateIssuanceLocalService
			medicalCertificateIssuanceLocalService) {

		_medicalCertificateIssuanceLocalService =
			medicalCertificateIssuanceLocalService;
	}

	private MedicalCertificateIssuanceLocalService
		_medicalCertificateIssuanceLocalService;

}