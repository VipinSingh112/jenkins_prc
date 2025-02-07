/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JTBLicenceCertificateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBLicenceCertificateLocalService
 * @generated
 */
public class JTBLicenceCertificateLocalServiceWrapper
	implements JTBLicenceCertificateLocalService,
			   ServiceWrapper<JTBLicenceCertificateLocalService> {

	public JTBLicenceCertificateLocalServiceWrapper() {
		this(null);
	}

	public JTBLicenceCertificateLocalServiceWrapper(
		JTBLicenceCertificateLocalService jtbLicenceCertificateLocalService) {

		_jtbLicenceCertificateLocalService = jtbLicenceCertificateLocalService;
	}

	/**
	 * Adds the jtb licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 * @return the jtb licence certificate that was added
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		addJTBLicenceCertificate(
			com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
				jtbLicenceCertificate) {

		return _jtbLicenceCertificateLocalService.addJTBLicenceCertificate(
			jtbLicenceCertificate);
	}

	/**
	 * Creates a new jtb licence certificate with the primary key. Does not add the jtb licence certificate to the database.
	 *
	 * @param jTBLicenceCertificateId the primary key for the new jtb licence certificate
	 * @return the new jtb licence certificate
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		createJTBLicenceCertificate(long jTBLicenceCertificateId) {

		return _jtbLicenceCertificateLocalService.createJTBLicenceCertificate(
			jTBLicenceCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbLicenceCertificateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		deleteJTBLicenceCertificate(
			com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
				jtbLicenceCertificate) {

		return _jtbLicenceCertificateLocalService.deleteJTBLicenceCertificate(
			jtbLicenceCertificate);
	}

	/**
	 * Deletes the jtb licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 * @throws PortalException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
			deleteJTBLicenceCertificate(long jTBLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbLicenceCertificateLocalService.deleteJTBLicenceCertificate(
			jTBLicenceCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbLicenceCertificateLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbLicenceCertificateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbLicenceCertificateLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbLicenceCertificateLocalService.dynamicQuery();
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

		return _jtbLicenceCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JTBLicenceCertificateModelImpl</code>.
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

		return _jtbLicenceCertificateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JTBLicenceCertificateModelImpl</code>.
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

		return _jtbLicenceCertificateLocalService.dynamicQuery(
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

		return _jtbLicenceCertificateLocalService.dynamicQueryCount(
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

		return _jtbLicenceCertificateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		fetchJTBLicenceCertificate(long jTBLicenceCertificateId) {

		return _jtbLicenceCertificateLocalService.fetchJTBLicenceCertificate(
			jTBLicenceCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbLicenceCertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbLicenceCertificateLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
			getJtbLicenceCertiBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJTBLicenceCertificateException {

		return _jtbLicenceCertificateLocalService.getJtbLicenceCertiBy_CI(
			caseId);
	}

	/**
	 * Returns the jtb licence certificate with the primary key.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate
	 * @throws PortalException if a jtb licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
			getJTBLicenceCertificate(long jTBLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbLicenceCertificateLocalService.getJTBLicenceCertificate(
			jTBLicenceCertificateId);
	}

	/**
	 * Returns a range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of jtb licence certificates
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate>
			getJTBLicenceCertificates(int start, int end) {

		return _jtbLicenceCertificateLocalService.getJTBLicenceCertificates(
			start, end);
	}

	/**
	 * Returns the number of jtb licence certificates.
	 *
	 * @return the number of jtb licence certificates
	 */
	@Override
	public int getJTBLicenceCertificatesCount() {
		return _jtbLicenceCertificateLocalService.
			getJTBLicenceCertificatesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbLicenceCertificateLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbLicenceCertificateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 * @return the jtb licence certificate that was updated
	 */
	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		updateJTBLicenceCertificate(
			com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
				jtbLicenceCertificate) {

		return _jtbLicenceCertificateLocalService.updateJTBLicenceCertificate(
			jtbLicenceCertificate);
	}

	@Override
	public com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate
		updateJTBLicenceCertificate(
			String caseId, String licenceCertificate, String category,
			java.util.Date issueDate, java.util.Date expirationDate,
			String status) {

		return _jtbLicenceCertificateLocalService.updateJTBLicenceCertificate(
			caseId, licenceCertificate, category, issueDate, expirationDate,
			status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbLicenceCertificateLocalService.getBasePersistence();
	}

	@Override
	public JTBLicenceCertificateLocalService getWrappedService() {
		return _jtbLicenceCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		JTBLicenceCertificateLocalService jtbLicenceCertificateLocalService) {

		_jtbLicenceCertificateLocalService = jtbLicenceCertificateLocalService;
	}

	private JTBLicenceCertificateLocalService
		_jtbLicenceCertificateLocalService;

}