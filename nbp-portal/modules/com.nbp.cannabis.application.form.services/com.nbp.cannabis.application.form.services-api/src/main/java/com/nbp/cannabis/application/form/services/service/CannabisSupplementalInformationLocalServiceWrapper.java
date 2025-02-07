/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisSupplementalInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformationLocalService
 * @generated
 */
public class CannabisSupplementalInformationLocalServiceWrapper
	implements CannabisSupplementalInformationLocalService,
			   ServiceWrapper<CannabisSupplementalInformationLocalService> {

	public CannabisSupplementalInformationLocalServiceWrapper() {
		this(null);
	}

	public CannabisSupplementalInformationLocalServiceWrapper(
		CannabisSupplementalInformationLocalService
			cannabisSupplementalInformationLocalService) {

		_cannabisSupplementalInformationLocalService =
			cannabisSupplementalInformationLocalService;
	}

	/**
	 * Adds the cannabis supplemental information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupplementalInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 * @return the cannabis supplemental information that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation addCannabisSupplementalInformation(
			com.nbp.cannabis.application.form.services.model.
				CannabisSupplementalInformation
					cannabisSupplementalInformation) {

		return _cannabisSupplementalInformationLocalService.
			addCannabisSupplementalInformation(cannabisSupplementalInformation);
	}

	/**
	 * Creates a new cannabis supplemental information with the primary key. Does not add the cannabis supplemental information to the database.
	 *
	 * @param cannabisSupplementalInfoId the primary key for the new cannabis supplemental information
	 * @return the new cannabis supplemental information
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation createCannabisSupplementalInformation(
			long cannabisSupplementalInfoId) {

		return _cannabisSupplementalInformationLocalService.
			createCannabisSupplementalInformation(cannabisSupplementalInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteCA_SI_CAI(long cannabisApplicationId) {
		_cannabisSupplementalInformationLocalService.deleteCA_SI_CAI(
			cannabisApplicationId);
	}

	/**
	 * Deletes the cannabis supplemental information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupplementalInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation deleteCannabisSupplementalInformation(
			com.nbp.cannabis.application.form.services.model.
				CannabisSupplementalInformation
					cannabisSupplementalInformation) {

		return _cannabisSupplementalInformationLocalService.
			deleteCannabisSupplementalInformation(
				cannabisSupplementalInformation);
	}

	/**
	 * Deletes the cannabis supplemental information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupplementalInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 * @throws PortalException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation deleteCannabisSupplementalInformation(
				long cannabisSupplementalInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.
			deleteCannabisSupplementalInformation(cannabisSupplementalInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisSupplementalInformationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisSupplementalInformationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisSupplementalInformationLocalService.dynamicQuery();
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

		return _cannabisSupplementalInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupplementalInformationModelImpl</code>.
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

		return _cannabisSupplementalInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupplementalInformationModelImpl</code>.
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

		return _cannabisSupplementalInformationLocalService.dynamicQuery(
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

		return _cannabisSupplementalInformationLocalService.dynamicQueryCount(
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

		return _cannabisSupplementalInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation fetchCannabisSupplementalInformation(
			long cannabisSupplementalInfoId) {

		return _cannabisSupplementalInformationLocalService.
			fetchCannabisSupplementalInformation(cannabisSupplementalInfoId);
	}

	/**
	 * Returns the cannabis supplemental information matching the UUID and group.
	 *
	 * @param uuid the cannabis supplemental information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation
			fetchCannabisSupplementalInformationByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisSupplementalInformationLocalService.
			fetchCannabisSupplementalInformationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisSupplementalInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupplementalInformation> getCA_SI_CAI(
				long cannabisAppicationId) {

		return _cannabisSupplementalInformationLocalService.getCA_SI_CAI(
			cannabisAppicationId);
	}

	/**
	 * Returns the cannabis supplemental information with the primary key.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information
	 * @throws PortalException if a cannabis supplemental information with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation getCannabisSupplementalInformation(
				long cannabisSupplementalInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformation(cannabisSupplementalInfoId);
	}

	/**
	 * Returns the cannabis supplemental information matching the UUID and group.
	 *
	 * @param uuid the cannabis supplemental information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis supplemental information
	 * @throws PortalException if a matching cannabis supplemental information could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation
				getCannabisSupplementalInformationByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of cannabis supplemental informations
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupplementalInformation>
				getCannabisSupplementalInformations(int start, int end) {

		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformations(start, end);
	}

	/**
	 * Returns all the cannabis supplemental informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis supplemental informations
	 * @param companyId the primary key of the company
	 * @return the matching cannabis supplemental informations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupplementalInformation>
				getCannabisSupplementalInformationsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformationsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis supplemental informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis supplemental informations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis supplemental informations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisSupplementalInformation>
				getCannabisSupplementalInformationsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisSupplementalInformation>
								orderByComparator) {

		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis supplemental informations.
	 *
	 * @return the number of cannabis supplemental informations
	 */
	@Override
	public int getCannabisSupplementalInformationsCount() {
		return _cannabisSupplementalInformationLocalService.
			getCannabisSupplementalInformationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisSupplementalInformationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisSupplementalInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisSupplementalInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisSupplementalInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis supplemental information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisSupplementalInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 * @return the cannabis supplemental information that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisSupplementalInformation updateCannabisSupplementalInformation(
			com.nbp.cannabis.application.form.services.model.
				CannabisSupplementalInformation
					cannabisSupplementalInformation) {

		return _cannabisSupplementalInformationLocalService.
			updateCannabisSupplementalInformation(
				cannabisSupplementalInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisSupplementalInformationLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisSupplementalInformationLocalService getWrappedService() {
		return _cannabisSupplementalInformationLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisSupplementalInformationLocalService
			cannabisSupplementalInformationLocalService) {

		_cannabisSupplementalInformationLocalService =
			cannabisSupplementalInformationLocalService;
	}

	private CannabisSupplementalInformationLocalService
		_cannabisSupplementalInformationLocalService;

}