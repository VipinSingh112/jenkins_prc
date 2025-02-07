/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CertificateOfVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationLocalService
 * @generated
 */
public class CertificateOfVerificationLocalServiceWrapper
	implements CertificateOfVerificationLocalService,
			   ServiceWrapper<CertificateOfVerificationLocalService> {

	public CertificateOfVerificationLocalServiceWrapper() {
		this(null);
	}

	public CertificateOfVerificationLocalServiceWrapper(
		CertificateOfVerificationLocalService
			certificateOfVerificationLocalService) {

		_certificateOfVerificationLocalService =
			certificateOfVerificationLocalService;
	}

	/**
	 * Adds the certificate of verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was added
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		addCertificateOfVerification(
			com.nbp.ncra.stages.services.model.CertificateOfVerification
				certificateOfVerification) {

		return _certificateOfVerificationLocalService.
			addCertificateOfVerification(certificateOfVerification);
	}

	/**
	 * Creates a new certificate of verification with the primary key. Does not add the certificate of verification to the database.
	 *
	 * @param certificateOfVerificationId the primary key for the new certificate of verification
	 * @return the new certificate of verification
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		createCertificateOfVerification(long certificateOfVerificationId) {

		return _certificateOfVerificationLocalService.
			createCertificateOfVerification(certificateOfVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _certificateOfVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the certificate of verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was removed
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		deleteCertificateOfVerification(
			com.nbp.ncra.stages.services.model.CertificateOfVerification
				certificateOfVerification) {

		return _certificateOfVerificationLocalService.
			deleteCertificateOfVerification(certificateOfVerification);
	}

	/**
	 * Deletes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws PortalException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
			deleteCertificateOfVerification(long certificateOfVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _certificateOfVerificationLocalService.
			deleteCertificateOfVerification(certificateOfVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _certificateOfVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _certificateOfVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _certificateOfVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _certificateOfVerificationLocalService.dynamicQuery();
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

		return _certificateOfVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
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

		return _certificateOfVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
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

		return _certificateOfVerificationLocalService.dynamicQuery(
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

		return _certificateOfVerificationLocalService.dynamicQueryCount(
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

		return _certificateOfVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		fetchCertificateOfVerification(long certificateOfVerificationId) {

		return _certificateOfVerificationLocalService.
			fetchCertificateOfVerification(certificateOfVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _certificateOfVerificationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the certificate of verification with the primary key.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws PortalException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
			getCertificateOfVerification(long certificateOfVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _certificateOfVerificationLocalService.
			getCertificateOfVerification(certificateOfVerificationId);
	}

	/**
	 * Returns a range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @return the range of certificate of verifications
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.CertificateOfVerification>
			getCertificateOfVerifications(int start, int end) {

		return _certificateOfVerificationLocalService.
			getCertificateOfVerifications(start, end);
	}

	/**
	 * Returns the number of certificate of verifications.
	 *
	 * @return the number of certificate of verifications
	 */
	@Override
	public int getCertificateOfVerificationsCount() {
		return _certificateOfVerificationLocalService.
			getCertificateOfVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _certificateOfVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
			getNcra_By_CaseId(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return _certificateOfVerificationLocalService.getNcra_By_CaseId(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _certificateOfVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _certificateOfVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the certificate of verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was updated
	 */
	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		updateCertificateOfVerification(
			com.nbp.ncra.stages.services.model.CertificateOfVerification
				certificateOfVerification) {

		return _certificateOfVerificationLocalService.
			updateCertificateOfVerification(certificateOfVerification);
	}

	@Override
	public com.nbp.ncra.stages.services.model.CertificateOfVerification
		updateNcraCertificateOfVerification(
			String caseId, String nameOfApplicant, String productName,
			java.util.Date dateCertificateIssued,
			java.util.Date dateOfExpiration, String certificateNumber) {

		return _certificateOfVerificationLocalService.
			updateNcraCertificateOfVerification(
				caseId, nameOfApplicant, productName, dateCertificateIssued,
				dateOfExpiration, certificateNumber);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _certificateOfVerificationLocalService.getBasePersistence();
	}

	@Override
	public CertificateOfVerificationLocalService getWrappedService() {
		return _certificateOfVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		CertificateOfVerificationLocalService
			certificateOfVerificationLocalService) {

		_certificateOfVerificationLocalService =
			certificateOfVerificationLocalService;
	}

	private CertificateOfVerificationLocalService
		_certificateOfVerificationLocalService;

}