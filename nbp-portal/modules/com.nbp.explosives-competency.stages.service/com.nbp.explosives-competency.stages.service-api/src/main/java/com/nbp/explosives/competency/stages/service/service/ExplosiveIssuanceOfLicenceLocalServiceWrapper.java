/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosiveIssuanceOfLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicenceLocalService
 * @generated
 */
public class ExplosiveIssuanceOfLicenceLocalServiceWrapper
	implements ExplosiveIssuanceOfLicenceLocalService,
			   ServiceWrapper<ExplosiveIssuanceOfLicenceLocalService> {

	public ExplosiveIssuanceOfLicenceLocalServiceWrapper() {
		this(null);
	}

	public ExplosiveIssuanceOfLicenceLocalServiceWrapper(
		ExplosiveIssuanceOfLicenceLocalService
			explosiveIssuanceOfLicenceLocalService) {

		_explosiveIssuanceOfLicenceLocalService =
			explosiveIssuanceOfLicenceLocalService;
	}

	/**
	 * Adds the explosive issuance of licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was added
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence addExplosiveIssuanceOfLicence(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return _explosiveIssuanceOfLicenceLocalService.
			addExplosiveIssuanceOfLicence(explosiveIssuanceOfLicence);
	}

	/**
	 * Creates a new explosive issuance of licence with the primary key. Does not add the explosive issuance of licence to the database.
	 *
	 * @param issuanceId the primary key for the new explosive issuance of licence
	 * @return the new explosive issuance of licence
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence createExplosiveIssuanceOfLicence(
			long issuanceId) {

		return _explosiveIssuanceOfLicenceLocalService.
			createExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosive issuance of licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence deleteExplosiveIssuanceOfLicence(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return _explosiveIssuanceOfLicenceLocalService.
			deleteExplosiveIssuanceOfLicence(explosiveIssuanceOfLicence);
	}

	/**
	 * Deletes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws PortalException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence deleteExplosiveIssuanceOfLicence(
				long issuanceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.
			deleteExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosiveIssuanceOfLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosiveIssuanceOfLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosiveIssuanceOfLicenceLocalService.dynamicQuery();
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

		return _explosiveIssuanceOfLicenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
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

		return _explosiveIssuanceOfLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
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

		return _explosiveIssuanceOfLicenceLocalService.dynamicQuery(
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

		return _explosiveIssuanceOfLicenceLocalService.dynamicQueryCount(
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

		return _explosiveIssuanceOfLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence fetchExplosiveIssuanceOfLicence(
			long issuanceId) {

		return _explosiveIssuanceOfLicenceLocalService.
			fetchExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence matching the UUID and group.
	 *
	 * @param uuid the explosive issuance of licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence
			fetchExplosiveIssuanceOfLicenceByUuidAndGroupId(
				String uuid, long groupId) {

		return _explosiveIssuanceOfLicenceLocalService.
			fetchExplosiveIssuanceOfLicenceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosiveIssuanceOfLicenceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive issuance of licence with the primary key.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws PortalException if a explosive issuance of licence with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence getExplosiveIssuanceOfLicence(
				long issuanceId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicence(issuanceId);
	}

	/**
	 * Returns the explosive issuance of licence matching the UUID and group.
	 *
	 * @param uuid the explosive issuance of licence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive issuance of licence
	 * @throws PortalException if a matching explosive issuance of licence could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence
				getExplosiveIssuanceOfLicenceByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicenceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of explosive issuance of licences
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveIssuanceOfLicence> getExplosiveIssuanceOfLicences(
				int start, int end) {

		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicences(start, end);
	}

	/**
	 * Returns all the explosive issuance of licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive issuance of licences
	 * @param companyId the primary key of the company
	 * @return the matching explosive issuance of licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveIssuanceOfLicence>
				getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicencesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of explosive issuance of licences matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive issuance of licences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive issuance of licences, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveIssuanceOfLicence>
				getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.explosives.competency.stages.service.model.
							ExplosiveIssuanceOfLicence> orderByComparator) {

		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicencesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive issuance of licences.
	 *
	 * @return the number of explosive issuance of licences
	 */
	@Override
	public int getExplosiveIssuanceOfLicencesCount() {
		return _explosiveIssuanceOfLicenceLocalService.
			getExplosiveIssuanceOfLicencesCount();
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence getExplosiveLicIssBy_CI(String caseId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveIssuanceOfLicenceException {

		return _explosiveIssuanceOfLicenceLocalService.getExplosiveLicIssBy_CI(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _explosiveIssuanceOfLicenceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosiveIssuanceOfLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveIssuanceOfLicenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveIssuanceOfLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosive issuance of licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveIssuanceOfLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 * @return the explosive issuance of licence that was updated
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence updateExplosiveIssuanceOfLicence(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return _explosiveIssuanceOfLicenceLocalService.
			updateExplosiveIssuanceOfLicence(explosiveIssuanceOfLicence);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveIssuanceOfLicence updateExplosiveIssuanceOfLicence(
				String caseId, java.util.Date dateOfIssue,
				java.util.Date dateOfExp, String certificateNum,
				long certificateId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveIssuanceOfLicenceException {

		return _explosiveIssuanceOfLicenceLocalService.
			updateExplosiveIssuanceOfLicence(
				caseId, dateOfIssue, dateOfExp, certificateNum, certificateId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosiveIssuanceOfLicenceLocalService.getBasePersistence();
	}

	@Override
	public ExplosiveIssuanceOfLicenceLocalService getWrappedService() {
		return _explosiveIssuanceOfLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosiveIssuanceOfLicenceLocalService
			explosiveIssuanceOfLicenceLocalService) {

		_explosiveIssuanceOfLicenceLocalService =
			explosiveIssuanceOfLicenceLocalService;
	}

	private ExplosiveIssuanceOfLicenceLocalService
		_explosiveIssuanceOfLicenceLocalService;

}