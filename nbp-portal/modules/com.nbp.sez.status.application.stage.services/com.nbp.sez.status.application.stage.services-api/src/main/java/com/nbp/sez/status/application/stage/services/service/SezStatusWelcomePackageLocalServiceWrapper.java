/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusWelcomePackageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackageLocalService
 * @generated
 */
public class SezStatusWelcomePackageLocalServiceWrapper
	implements ServiceWrapper<SezStatusWelcomePackageLocalService>,
			   SezStatusWelcomePackageLocalService {

	public SezStatusWelcomePackageLocalServiceWrapper() {
		this(null);
	}

	public SezStatusWelcomePackageLocalServiceWrapper(
		SezStatusWelcomePackageLocalService
			sezStatusWelcomePackageLocalService) {

		_sezStatusWelcomePackageLocalService =
			sezStatusWelcomePackageLocalService;
	}

	/**
	 * Adds the sez status welcome package to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWelcomePackageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 * @return the sez status welcome package that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage addSezStatusWelcomePackage(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusWelcomePackage sezStatusWelcomePackage) {

		return _sezStatusWelcomePackageLocalService.addSezStatusWelcomePackage(
			sezStatusWelcomePackage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status welcome package with the primary key. Does not add the sez status welcome package to the database.
	 *
	 * @param sezStatusWelcomeId the primary key for the new sez status welcome package
	 * @return the new sez status welcome package
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage createSezStatusWelcomePackage(
				long sezStatusWelcomeId) {

		return _sezStatusWelcomePackageLocalService.
			createSezStatusWelcomePackage(sezStatusWelcomeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status welcome package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWelcomePackageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package that was removed
	 * @throws PortalException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage deleteSezStatusWelcomePackage(
					long sezStatusWelcomeId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.
			deleteSezStatusWelcomePackage(sezStatusWelcomeId);
	}

	/**
	 * Deletes the sez status welcome package from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWelcomePackageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 * @return the sez status welcome package that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage deleteSezStatusWelcomePackage(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusWelcomePackage sezStatusWelcomePackage) {

		return _sezStatusWelcomePackageLocalService.
			deleteSezStatusWelcomePackage(sezStatusWelcomePackage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusWelcomePackageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusWelcomePackageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusWelcomePackageLocalService.dynamicQuery();
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

		return _sezStatusWelcomePackageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWelcomePackageModelImpl</code>.
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

		return _sezStatusWelcomePackageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWelcomePackageModelImpl</code>.
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

		return _sezStatusWelcomePackageLocalService.dynamicQuery(
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

		return _sezStatusWelcomePackageLocalService.dynamicQueryCount(
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

		return _sezStatusWelcomePackageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage fetchSezStatusWelcomePackage(
				long sezStatusWelcomeId) {

		return _sezStatusWelcomePackageLocalService.
			fetchSezStatusWelcomePackage(sezStatusWelcomeId);
	}

	/**
	 * Returns the sez status welcome package matching the UUID and group.
	 *
	 * @param uuid the sez status welcome package's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage
				fetchSezStatusWelcomePackageByUuidAndGroupId(
					String uuid, long groupId) {

		return _sezStatusWelcomePackageLocalService.
			fetchSezStatusWelcomePackageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusWelcomePackageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusWelcomePackageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusWelcomePackageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWelcomePackageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage getSezStatus_Welcome_Package_By_CI(
					String caseId)
				throws com.nbp.sez.status.application.stage.services.exception.
					NoSuchSezStatusWelcomePackageException {

		return _sezStatusWelcomePackageLocalService.
			getSezStatus_Welcome_Package_By_CI(caseId);
	}

	/**
	 * Returns the sez status welcome package with the primary key.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package
	 * @throws PortalException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage getSezStatusWelcomePackage(
					long sezStatusWelcomeId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.getSezStatusWelcomePackage(
			sezStatusWelcomeId);
	}

	/**
	 * Returns the sez status welcome package matching the UUID and group.
	 *
	 * @param uuid the sez status welcome package's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status welcome package
	 * @throws PortalException if a matching sez status welcome package could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage getSezStatusWelcomePackageByUuidAndGroupId(
					String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWelcomePackageLocalService.
			getSezStatusWelcomePackageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of sez status welcome packages
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage> getSezStatusWelcomePackages(
				int start, int end) {

		return _sezStatusWelcomePackageLocalService.getSezStatusWelcomePackages(
			start, end);
	}

	/**
	 * Returns all the sez status welcome packages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status welcome packages
	 * @param companyId the primary key of the company
	 * @return the matching sez status welcome packages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage>
				getSezStatusWelcomePackagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _sezStatusWelcomePackageLocalService.
			getSezStatusWelcomePackagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sez status welcome packages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status welcome packages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status welcome packages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage>
				getSezStatusWelcomePackagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.sez.status.application.stage.services.model.
							SezStatusWelcomePackage> orderByComparator) {

		return _sezStatusWelcomePackageLocalService.
			getSezStatusWelcomePackagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status welcome packages.
	 *
	 * @return the number of sez status welcome packages
	 */
	@Override
	public int getSezStatusWelcomePackagesCount() {
		return _sezStatusWelcomePackageLocalService.
			getSezStatusWelcomePackagesCount();
	}

	/**
	 * Updates the sez status welcome package in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWelcomePackageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 * @return the sez status welcome package that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage updateSezStatusWelcomePackage(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusWelcomePackage sezStatusWelcomePackage) {

		return _sezStatusWelcomePackageLocalService.
			updateSezStatusWelcomePackage(sezStatusWelcomePackage);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusWelcomePackage updateSezStatusWelcomePackage(
				String caseId, java.util.Date dateOfWelcomePackageSigned,
				java.util.Date dateOfApplicantSigned,
				long welcomePackageFileEntry) {

		return _sezStatusWelcomePackageLocalService.
			updateSezStatusWelcomePackage(
				caseId, dateOfWelcomePackageSigned, dateOfApplicantSigned,
				welcomePackageFileEntry);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusWelcomePackageLocalService.getBasePersistence();
	}

	@Override
	public SezStatusWelcomePackageLocalService getWrappedService() {
		return _sezStatusWelcomePackageLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusWelcomePackageLocalService
			sezStatusWelcomePackageLocalService) {

		_sezStatusWelcomePackageLocalService =
			sezStatusWelcomePackageLocalService;
	}

	private SezStatusWelcomePackageLocalService
		_sezStatusWelcomePackageLocalService;

}