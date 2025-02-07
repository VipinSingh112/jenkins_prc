/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusLicenseIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuanceLocalService
 * @generated
 */
public class SezStatusLicenseIssuanceLocalServiceWrapper
	implements ServiceWrapper<SezStatusLicenseIssuanceLocalService>,
			   SezStatusLicenseIssuanceLocalService {

	public SezStatusLicenseIssuanceLocalServiceWrapper() {
		this(null);
	}

	public SezStatusLicenseIssuanceLocalServiceWrapper(
		SezStatusLicenseIssuanceLocalService
			sezStatusLicenseIssuanceLocalService) {

		_sezStatusLicenseIssuanceLocalService =
			sezStatusLicenseIssuanceLocalService;
	}

	/**
	 * Adds the sez status license issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance addSezStatusLicenseIssuance(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return _sezStatusLicenseIssuanceLocalService.
			addSezStatusLicenseIssuance(sezStatusLicenseIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status license issuance with the primary key. Does not add the sez status license issuance to the database.
	 *
	 * @param sezStatusLicIssuedId the primary key for the new sez status license issuance
	 * @return the new sez status license issuance
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance createSezStatusLicenseIssuance(
				long sezStatusLicIssuedId) {

		return _sezStatusLicenseIssuanceLocalService.
			createSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws PortalException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance deleteSezStatusLicenseIssuance(
					long sezStatusLicIssuedId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.
			deleteSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * Deletes the sez status license issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance deleteSezStatusLicenseIssuance(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return _sezStatusLicenseIssuanceLocalService.
			deleteSezStatusLicenseIssuance(sezStatusLicenseIssuance);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusLicenseIssuanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusLicenseIssuanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusLicenseIssuanceLocalService.dynamicQuery();
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

		return _sezStatusLicenseIssuanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
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

		return _sezStatusLicenseIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
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

		return _sezStatusLicenseIssuanceLocalService.dynamicQuery(
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

		return _sezStatusLicenseIssuanceLocalService.dynamicQueryCount(
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

		return _sezStatusLicenseIssuanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance fetchSezStatusLicenseIssuance(
				long sezStatusLicIssuedId) {

		return _sezStatusLicenseIssuanceLocalService.
			fetchSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance matching the UUID and group.
	 *
	 * @param uuid the sez status license issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance
				fetchSezStatusLicenseIssuanceByUuidAndGroupId(
					String uuid, long groupId) {

		return _sezStatusLicenseIssuanceLocalService.
			fetchSezStatusLicenseIssuanceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusLicenseIssuanceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusLicenseIssuanceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusLicenseIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusLicenseIssuanceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance getSezStatus_License_Issuance_By_Id(
					String caseId)
				throws com.nbp.sez.status.application.stage.services.exception.
					NoSuchSezStatusLicenseIssuanceException {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatus_License_Issuance_By_Id(caseId);
	}

	/**
	 * Returns the sez status license issuance with the primary key.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws PortalException if a sez status license issuance with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance getSezStatusLicenseIssuance(
					long sezStatusLicIssuedId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance matching the UUID and group.
	 *
	 * @param uuid the sez status license issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status license issuance
	 * @throws PortalException if a matching sez status license issuance could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance
					getSezStatusLicenseIssuanceByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuanceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of sez status license issuances
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance> getSezStatusLicenseIssuances(
				int start, int end) {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuances(start, end);
	}

	/**
	 * Returns all the sez status license issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status license issuances
	 * @param companyId the primary key of the company
	 * @return the matching sez status license issuances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance>
				getSezStatusLicenseIssuancesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuancesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sez status license issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status license issuances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status license issuances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance>
				getSezStatusLicenseIssuancesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.sez.status.application.stage.services.model.
							SezStatusLicenseIssuance> orderByComparator) {

		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuancesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status license issuances.
	 *
	 * @return the number of sez status license issuances
	 */
	@Override
	public int getSezStatusLicenseIssuancesCount() {
		return _sezStatusLicenseIssuanceLocalService.
			getSezStatusLicenseIssuancesCount();
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance updateSezStatus_License_(
				String caseId, String nameOfApplicant, String licenseNumber,
				String sezStatus, java.util.Date dateOfLicenseIssued,
				java.util.Date dateOfLicenseExpiration, long licenceFileEntryId,
				String sezDeveloperNumber) {

		return _sezStatusLicenseIssuanceLocalService.updateSezStatus_License_(
			caseId, nameOfApplicant, licenseNumber, sezStatus,
			dateOfLicenseIssued, dateOfLicenseExpiration, licenceFileEntryId,
			sezDeveloperNumber);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance updateSezStatus_License_Issuance(
				String caseId, java.util.Date dateOfLicenseIssued,
				java.util.Date dateOfLicenseExpiration,
				long licenceFileEntryId) {

		return _sezStatusLicenseIssuanceLocalService.
			updateSezStatus_License_Issuance(
				caseId, dateOfLicenseIssued, dateOfLicenseExpiration,
				licenceFileEntryId);
	}

	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance updateSezStatus_License_Issuance_(
				String caseId, String nameOfApplicant, String licenseNumber,
				String sezStatus, java.util.Date dateOfLicenseIssued,
				java.util.Date dateOfLicenseExpiration,
				long licenceFileEntryId) {

		return _sezStatusLicenseIssuanceLocalService.
			updateSezStatus_License_Issuance_(
				caseId, nameOfApplicant, licenseNumber, sezStatus,
				dateOfLicenseIssued, dateOfLicenseExpiration,
				licenceFileEntryId);
	}

	/**
	 * Updates the sez status license issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.stage.services.model.
			SezStatusLicenseIssuance updateSezStatusLicenseIssuance(
				com.nbp.sez.status.application.stage.services.model.
					SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return _sezStatusLicenseIssuanceLocalService.
			updateSezStatusLicenseIssuance(sezStatusLicenseIssuance);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusLicenseIssuanceLocalService.getBasePersistence();
	}

	@Override
	public SezStatusLicenseIssuanceLocalService getWrappedService() {
		return _sezStatusLicenseIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusLicenseIssuanceLocalService
			sezStatusLicenseIssuanceLocalService) {

		_sezStatusLicenseIssuanceLocalService =
			sezStatusLicenseIssuanceLocalService;
	}

	private SezStatusLicenseIssuanceLocalService
		_sezStatusLicenseIssuanceLocalService;

}