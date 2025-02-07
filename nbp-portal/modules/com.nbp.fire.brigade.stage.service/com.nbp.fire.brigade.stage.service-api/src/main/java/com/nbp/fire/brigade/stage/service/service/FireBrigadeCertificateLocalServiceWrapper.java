/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeCertificateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificateLocalService
 * @generated
 */
public class FireBrigadeCertificateLocalServiceWrapper
	implements FireBrigadeCertificateLocalService,
			   ServiceWrapper<FireBrigadeCertificateLocalService> {

	public FireBrigadeCertificateLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeCertificateLocalServiceWrapper(
		FireBrigadeCertificateLocalService fireBrigadeCertificateLocalService) {

		_fireBrigadeCertificateLocalService =
			fireBrigadeCertificateLocalService;
	}

	/**
	 * Adds the fire brigade certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was added
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		addFireBrigadeCertificate(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
				fireBrigadeCertificate) {

		return _fireBrigadeCertificateLocalService.addFireBrigadeCertificate(
			fireBrigadeCertificate);
	}

	/**
	 * Creates a new fire brigade certificate with the primary key. Does not add the fire brigade certificate to the database.
	 *
	 * @param fireBrigadeCertificateId the primary key for the new fire brigade certificate
	 * @return the new fire brigade certificate
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		createFireBrigadeCertificate(long fireBrigadeCertificateId) {

		return _fireBrigadeCertificateLocalService.createFireBrigadeCertificate(
			fireBrigadeCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCertificateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		deleteFireBrigadeCertificate(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
				fireBrigadeCertificate) {

		return _fireBrigadeCertificateLocalService.deleteFireBrigadeCertificate(
			fireBrigadeCertificate);
	}

	/**
	 * Deletes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws PortalException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
			deleteFireBrigadeCertificate(long fireBrigadeCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCertificateLocalService.deleteFireBrigadeCertificate(
			fireBrigadeCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCertificateLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeCertificateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeCertificateLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeCertificateLocalService.dynamicQuery();
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

		return _fireBrigadeCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
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

		return _fireBrigadeCertificateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
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

		return _fireBrigadeCertificateLocalService.dynamicQuery(
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

		return _fireBrigadeCertificateLocalService.dynamicQueryCount(
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

		return _fireBrigadeCertificateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		fetchFireBrigadeCertificate(long fireBrigadeCertificateId) {

		return _fireBrigadeCertificateLocalService.fetchFireBrigadeCertificate(
			fireBrigadeCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeCertificateLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fire brigade certificate with the primary key.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws PortalException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
			getFireBrigadeCertificate(long fireBrigadeCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCertificateLocalService.getFireBrigadeCertificate(
			fireBrigadeCertificateId);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
			getFireBrigadeCertificateByCaseId(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return _fireBrigadeCertificateLocalService.
			getFireBrigadeCertificateByCaseId(caseId);
	}

	/**
	 * Returns a range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @return the range of fire brigade certificates
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate>
			getFireBrigadeCertificates(int start, int end) {

		return _fireBrigadeCertificateLocalService.getFireBrigadeCertificates(
			start, end);
	}

	/**
	 * Returns the number of fire brigade certificates.
	 *
	 * @return the number of fire brigade certificates
	 */
	@Override
	public int getFireBrigadeCertificatesCount() {
		return _fireBrigadeCertificateLocalService.
			getFireBrigadeCertificatesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeCertificateLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeCertificateLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeCertificateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		updateFireBrigadeApplicationCertificate(
			String caseId, String nameOfOwner, String typeOfPremises,
			java.util.Date dateOfIssue, java.util.Date dateOfExpiry,
			String certificateNumber) {

		return _fireBrigadeCertificateLocalService.
			updateFireBrigadeApplicationCertificate(
				caseId, nameOfOwner, typeOfPremises, dateOfIssue, dateOfExpiry,
				certificateNumber);
	}

	/**
	 * Updates the fire brigade certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was updated
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		updateFireBrigadeCertificate(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
				fireBrigadeCertificate) {

		return _fireBrigadeCertificateLocalService.updateFireBrigadeCertificate(
			fireBrigadeCertificate);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate
		updateFireBrigadeCertificate(
			String caseId, String nameOfOwner, String typeOfPremises,
			java.util.Date dateOfIssue, java.util.Date dateOfExpiry) {

		return _fireBrigadeCertificateLocalService.updateFireBrigadeCertificate(
			caseId, nameOfOwner, typeOfPremises, dateOfIssue, dateOfExpiry);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeCertificateLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeCertificateLocalService getWrappedService() {
		return _fireBrigadeCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeCertificateLocalService fireBrigadeCertificateLocalService) {

		_fireBrigadeCertificateLocalService =
			fireBrigadeCertificateLocalService;
	}

	private FireBrigadeCertificateLocalService
		_fireBrigadeCertificateLocalService;

}