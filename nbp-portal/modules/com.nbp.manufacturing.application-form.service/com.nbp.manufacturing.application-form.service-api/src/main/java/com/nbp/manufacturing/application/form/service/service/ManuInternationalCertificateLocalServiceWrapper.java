/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuInternationalCertificateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificateLocalService
 * @generated
 */
public class ManuInternationalCertificateLocalServiceWrapper
	implements ManuInternationalCertificateLocalService,
			   ServiceWrapper<ManuInternationalCertificateLocalService> {

	public ManuInternationalCertificateLocalServiceWrapper() {
		this(null);
	}

	public ManuInternationalCertificateLocalServiceWrapper(
		ManuInternationalCertificateLocalService
			manuInternationalCertificateLocalService) {

		_manuInternationalCertificateLocalService =
			manuInternationalCertificateLocalService;
	}

	/**
	 * Adds the manu international certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate addManuInternationalCertificate(
			com.nbp.manufacturing.application.form.service.model.
				ManuInternationalCertificate manuInternationalCertificate) {

		return _manuInternationalCertificateLocalService.
			addManuInternationalCertificate(manuInternationalCertificate);
	}

	/**
	 * Creates a new manu international certificate with the primary key. Does not add the manu international certificate to the database.
	 *
	 * @param manuInternationalCertificateId the primary key for the new manu international certificate
	 * @return the new manu international certificate
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate createManuInternationalCertificate(
			long manuInternationalCertificateId) {

		return _manuInternationalCertificateLocalService.
			createManuInternationalCertificate(manuInternationalCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInternationalCertificateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws PortalException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate deleteManuInternationalCertificate(
				long manuInternationalCertificateId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInternationalCertificateLocalService.
			deleteManuInternationalCertificate(manuInternationalCertificateId);
	}

	/**
	 * Deletes the manu international certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate deleteManuInternationalCertificate(
			com.nbp.manufacturing.application.form.service.model.
				ManuInternationalCertificate manuInternationalCertificate) {

		return _manuInternationalCertificateLocalService.
			deleteManuInternationalCertificate(manuInternationalCertificate);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInternationalCertificateLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuInternationalCertificateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuInternationalCertificateLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuInternationalCertificateLocalService.dynamicQuery();
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

		return _manuInternationalCertificateLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
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

		return _manuInternationalCertificateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
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

		return _manuInternationalCertificateLocalService.dynamicQuery(
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

		return _manuInternationalCertificateLocalService.dynamicQueryCount(
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

		return _manuInternationalCertificateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate fetchManuInternationalCertificate(
			long manuInternationalCertificateId) {

		return _manuInternationalCertificateLocalService.
			fetchManuInternationalCertificate(manuInternationalCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuInternationalCertificateLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuInternationalCertificateLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuInternationalCertificate> getMA_IC_MAI(long applicationId) {

		return _manuInternationalCertificateLocalService.getMA_IC_MAI(
			applicationId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate getManuByAppId(long applicationId) {

		return _manuInternationalCertificateLocalService.getManuByAppId(
			applicationId);
	}

	/**
	 * Returns the manu international certificate with the primary key.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws PortalException if a manu international certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate getManuInternationalCertificate(
				long manuInternationalCertificateId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInternationalCertificateLocalService.
			getManuInternationalCertificate(manuInternationalCertificateId);
	}

	/**
	 * Returns a range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of manu international certificates
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuInternationalCertificate> getManuInternationalCertificates(
				int start, int end) {

		return _manuInternationalCertificateLocalService.
			getManuInternationalCertificates(start, end);
	}

	/**
	 * Returns the number of manu international certificates.
	 *
	 * @return the number of manu international certificates
	 */
	@Override
	public int getManuInternationalCertificatesCount() {
		return _manuInternationalCertificateLocalService.
			getManuInternationalCertificatesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuInternationalCertificateLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInternationalCertificateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu international certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuInternationalCertificate updateManuInternationalCertificate(
			com.nbp.manufacturing.application.form.service.model.
				ManuInternationalCertificate manuInternationalCertificate) {

		return _manuInternationalCertificateLocalService.
			updateManuInternationalCertificate(manuInternationalCertificate);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuInternationalCertificateLocalService.getBasePersistence();
	}

	@Override
	public ManuInternationalCertificateLocalService getWrappedService() {
		return _manuInternationalCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		ManuInternationalCertificateLocalService
			manuInternationalCertificateLocalService) {

		_manuInternationalCertificateLocalService =
			manuInternationalCertificateLocalService;
	}

	private ManuInternationalCertificateLocalService
		_manuInternationalCertificateLocalService;

}