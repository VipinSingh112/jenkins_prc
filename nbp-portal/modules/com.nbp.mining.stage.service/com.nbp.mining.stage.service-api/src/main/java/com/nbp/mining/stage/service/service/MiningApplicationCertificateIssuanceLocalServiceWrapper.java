/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningApplicationCertificateIssuanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationCertificateIssuanceLocalService
 * @generated
 */
public class MiningApplicationCertificateIssuanceLocalServiceWrapper
	implements MiningApplicationCertificateIssuanceLocalService,
			   ServiceWrapper
				   <MiningApplicationCertificateIssuanceLocalService> {

	public MiningApplicationCertificateIssuanceLocalServiceWrapper() {
		this(null);
	}

	public MiningApplicationCertificateIssuanceLocalServiceWrapper(
		MiningApplicationCertificateIssuanceLocalService
			miningApplicationCertificateIssuanceLocalService) {

		_miningApplicationCertificateIssuanceLocalService =
			miningApplicationCertificateIssuanceLocalService;
	}

	/**
	 * Adds the mining application certificate issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationCertificateIssuance the mining application certificate issuance
	 * @return the mining application certificate issuance that was added
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			addMiningApplicationCertificateIssuance(
				com.nbp.mining.stage.service.model.
					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance) {

		return _miningApplicationCertificateIssuanceLocalService.
			addMiningApplicationCertificateIssuance(
				miningApplicationCertificateIssuance);
	}

	/**
	 * Creates a new mining application certificate issuance with the primary key. Does not add the mining application certificate issuance to the database.
	 *
	 * @param miningCertIssuId the primary key for the new mining application certificate issuance
	 * @return the new mining application certificate issuance
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			createMiningApplicationCertificateIssuance(long miningCertIssuId) {

		return _miningApplicationCertificateIssuanceLocalService.
			createMiningApplicationCertificateIssuance(miningCertIssuId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the mining application certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance that was removed
	 * @throws PortalException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
				deleteMiningApplicationCertificateIssuance(
					long miningCertIssuId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			deleteMiningApplicationCertificateIssuance(miningCertIssuId);
	}

	/**
	 * Deletes the mining application certificate issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationCertificateIssuance the mining application certificate issuance
	 * @return the mining application certificate issuance that was removed
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			deleteMiningApplicationCertificateIssuance(
				com.nbp.mining.stage.service.model.
					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance) {

		return _miningApplicationCertificateIssuanceLocalService.
			deleteMiningApplicationCertificateIssuance(
				miningApplicationCertificateIssuance);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningApplicationCertificateIssuanceLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningApplicationCertificateIssuanceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningApplicationCertificateIssuanceLocalService.dynamicQuery();
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

		return _miningApplicationCertificateIssuanceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceModelImpl</code>.
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

		return _miningApplicationCertificateIssuanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceModelImpl</code>.
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

		return _miningApplicationCertificateIssuanceLocalService.dynamicQuery(
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

		return _miningApplicationCertificateIssuanceLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _miningApplicationCertificateIssuanceLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			fetchMiningApplicationCertificateIssuance(long miningCertIssuId) {

		return _miningApplicationCertificateIssuanceLocalService.
			fetchMiningApplicationCertificateIssuance(miningCertIssuId);
	}

	/**
	 * Returns the mining application certificate issuance matching the UUID and group.
	 *
	 * @param uuid the mining application certificate issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			fetchMiningApplicationCertificateIssuanceByUuidAndGroupId(
				String uuid, long groupId) {

		return _miningApplicationCertificateIssuanceLocalService.
			fetchMiningApplicationCertificateIssuanceByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningApplicationCertificateIssuanceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miningApplicationCertificateIssuanceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningApplicationCertificateIssuanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining application certificate issuance with the primary key.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance
	 * @throws PortalException if a mining application certificate issuance with the primary key could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
				getMiningApplicationCertificateIssuance(long miningCertIssuId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuance(miningCertIssuId);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
				getMiningApplicationCertificateIssuanceByCI(String caseId)
			throws com.nbp.mining.stage.service.exception.
				NoSuchMiningApplicationCertificateIssuanceException {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuanceByCI(caseId);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
				getMiningApplicationCertificateIssuanceByCN(
					String certificateNumber)
			throws com.nbp.mining.stage.service.exception.
				NoSuchMiningApplicationCertificateIssuanceException {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuanceByCN(certificateNumber);
	}

	/**
	 * Returns the mining application certificate issuance matching the UUID and group.
	 *
	 * @param uuid the mining application certificate issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application certificate issuance
	 * @throws PortalException if a matching mining application certificate issuance could not be found
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
				getMiningApplicationCertificateIssuanceByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuanceByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of mining application certificate issuances
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationCertificateIssuance>
				getMiningApplicationCertificateIssuances(int start, int end) {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuances(start, end);
	}

	/**
	 * Returns all the mining application certificate issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application certificate issuances
	 * @param companyId the primary key of the company
	 * @return the matching mining application certificate issuances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationCertificateIssuance>
				getMiningApplicationCertificateIssuancesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuancesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of mining application certificate issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application certificate issuances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application certificate issuances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.
			MiningApplicationCertificateIssuance>
				getMiningApplicationCertificateIssuancesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.mining.stage.service.model.
							MiningApplicationCertificateIssuance>
								orderByComparator) {

		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuancesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application certificate issuances.
	 *
	 * @return the number of mining application certificate issuances
	 */
	@Override
	public int getMiningApplicationCertificateIssuancesCount() {
		return _miningApplicationCertificateIssuanceLocalService.
			getMiningApplicationCertificateIssuancesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationCertificateIssuanceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationCertificateIssuanceLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the mining application certificate issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationCertificateIssuance the mining application certificate issuance
	 * @return the mining application certificate issuance that was updated
	 */
	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			updateMiningApplicationCertificateIssuance(
				com.nbp.mining.stage.service.model.
					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance) {

		return _miningApplicationCertificateIssuanceLocalService.
			updateMiningApplicationCertificateIssuance(
				miningApplicationCertificateIssuance);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			updateMiningCertificateIssuance(
				String caseId, String status,
				java.util.Date dateCertificateIssued,
				java.util.Date dateOfExpiration, String certificateNumber) {

		return _miningApplicationCertificateIssuanceLocalService.
			updateMiningCertificateIssuance(
				caseId, status, dateCertificateIssued, dateOfExpiration,
				certificateNumber);
	}

	@Override
	public
		com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance
			updateMiningCertificateIssuance(
				String caseId, String status,
				java.util.Date dateCertificateIssued,
				java.util.Date dateOfExpiration, String certificateNumber,
				long docId) {

		return _miningApplicationCertificateIssuanceLocalService.
			updateMiningCertificateIssuance(
				caseId, status, dateCertificateIssued, dateOfExpiration,
				certificateNumber, docId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningApplicationCertificateIssuanceLocalService.
			getBasePersistence();
	}

	@Override
	public MiningApplicationCertificateIssuanceLocalService
		getWrappedService() {

		return _miningApplicationCertificateIssuanceLocalService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationCertificateIssuanceLocalService
			miningApplicationCertificateIssuanceLocalService) {

		_miningApplicationCertificateIssuanceLocalService =
			miningApplicationCertificateIssuanceLocalService;
	}

	private MiningApplicationCertificateIssuanceLocalService
		_miningApplicationCertificateIssuanceLocalService;

}