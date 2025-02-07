/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjLicenceCertificateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateLocalService
 * @generated
 */
public class NcbjLicenceCertificateLocalServiceWrapper
	implements NcbjLicenceCertificateLocalService,
			   ServiceWrapper<NcbjLicenceCertificateLocalService> {

	public NcbjLicenceCertificateLocalServiceWrapper() {
		this(null);
	}

	public NcbjLicenceCertificateLocalServiceWrapper(
		NcbjLicenceCertificateLocalService ncbjLicenceCertificateLocalService) {

		_ncbjLicenceCertificateLocalService =
			ncbjLicenceCertificateLocalService;
	}

	/**
	 * Adds the ncbj licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		addNcbjLicenceCertificate(
			com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
				ncbjLicenceCertificate) {

		return _ncbjLicenceCertificateLocalService.addNcbjLicenceCertificate(
			ncbjLicenceCertificate);
	}

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		createNcbjLicenceCertificate(long ncbjLicenceCertificateId) {

		return _ncbjLicenceCertificateLocalService.createNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjLicenceCertificateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
			deleteNcbjLicenceCertificate(long ncbjLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjLicenceCertificateLocalService.deleteNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
	}

	/**
	 * Deletes the ncbj licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		deleteNcbjLicenceCertificate(
			com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
				ncbjLicenceCertificate) {

		return _ncbjLicenceCertificateLocalService.deleteNcbjLicenceCertificate(
			ncbjLicenceCertificate);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjLicenceCertificateLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjLicenceCertificateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjLicenceCertificateLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjLicenceCertificateLocalService.dynamicQuery();
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

		return _ncbjLicenceCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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

		return _ncbjLicenceCertificateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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

		return _ncbjLicenceCertificateLocalService.dynamicQuery(
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

		return _ncbjLicenceCertificateLocalService.dynamicQueryCount(
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

		return _ncbjLicenceCertificateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		fetchNcbjLicenceCertificate(long ncbjLicenceCertificateId) {

		return _ncbjLicenceCertificateLocalService.fetchNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjLicenceCertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjLicenceCertificateLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
			getNcbjLicenceCertiBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return _ncbjLicenceCertificateLocalService.getNcbjLicenceCertiBy_CI(
			caseId);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
			getNcbjLicenceCertificate(long ncbjLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjLicenceCertificateLocalService.getNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
	}

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate>
			getNcbjLicenceCertificates(int start, int end) {

		return _ncbjLicenceCertificateLocalService.getNcbjLicenceCertificates(
			start, end);
	}

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
	 */
	@Override
	public int getNcbjLicenceCertificatesCount() {
		return _ncbjLicenceCertificateLocalService.
			getNcbjLicenceCertificatesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjLicenceCertificateLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjLicenceCertificateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		updateNcbjLicenceCertificate(
			com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
				ncbjLicenceCertificate) {

		return _ncbjLicenceCertificateLocalService.updateNcbjLicenceCertificate(
			ncbjLicenceCertificate);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate
		updateNcbjLicenceCertificate(
			String caseId, String licenceCertificate, String nameOfAppli,
			String nameOfCerti, String scopeOfCerti, java.util.Date issueDate,
			java.util.Date expirationDate, String status) {

		return _ncbjLicenceCertificateLocalService.updateNcbjLicenceCertificate(
			caseId, licenceCertificate, nameOfAppli, nameOfCerti, scopeOfCerti,
			issueDate, expirationDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjLicenceCertificateLocalService.getBasePersistence();
	}

	@Override
	public NcbjLicenceCertificateLocalService getWrappedService() {
		return _ncbjLicenceCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjLicenceCertificateLocalService ncbjLicenceCertificateLocalService) {

		_ncbjLicenceCertificateLocalService =
			ncbjLicenceCertificateLocalService;
	}

	private NcbjLicenceCertificateLocalService
		_ncbjLicenceCertificateLocalService;

}