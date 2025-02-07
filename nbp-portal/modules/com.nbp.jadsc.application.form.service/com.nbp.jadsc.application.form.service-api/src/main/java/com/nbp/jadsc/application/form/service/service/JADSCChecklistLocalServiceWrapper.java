/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCChecklistLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistLocalService
 * @generated
 */
public class JADSCChecklistLocalServiceWrapper
	implements JADSCChecklistLocalService,
			   ServiceWrapper<JADSCChecklistLocalService> {

	public JADSCChecklistLocalServiceWrapper() {
		this(null);
	}

	public JADSCChecklistLocalServiceWrapper(
		JADSCChecklistLocalService jadscChecklistLocalService) {

		_jadscChecklistLocalService = jadscChecklistLocalService;
	}

	/**
	 * Adds the jadsc checklist to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		addJADSCChecklist(
			com.nbp.jadsc.application.form.service.model.JADSCChecklist
				jadscChecklist) {

		return _jadscChecklistLocalService.addJADSCChecklist(jadscChecklist);
	}

	/**
	 * Creates a new jadsc checklist with the primary key. Does not add the jadsc checklist to the database.
	 *
	 * @param jadscChecklistId the primary key for the new jadsc checklist
	 * @return the new jadsc checklist
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		createJADSCChecklist(long jadscChecklistId) {

		return _jadscChecklistLocalService.createJADSCChecklist(
			jadscChecklistId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jadsc checklist from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		deleteJADSCChecklist(
			com.nbp.jadsc.application.form.service.model.JADSCChecklist
				jadscChecklist) {

		return _jadscChecklistLocalService.deleteJADSCChecklist(jadscChecklist);
	}

	/**
	 * Deletes the jadsc checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist that was removed
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
			deleteJADSCChecklist(long jadscChecklistId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.deleteJADSCChecklist(
			jadscChecklistId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscChecklistLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscChecklistLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscChecklistLocalService.dynamicQuery();
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

		return _jadscChecklistLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
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

		return _jadscChecklistLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
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

		return _jadscChecklistLocalService.dynamicQuery(
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

		return _jadscChecklistLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jadscChecklistLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		fetchJADSCChecklist(long jadscChecklistId) {

		return _jadscChecklistLocalService.fetchJADSCChecklist(
			jadscChecklistId);
	}

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		fetchJADSCChecklistByUuidAndGroupId(String uuid, long groupId) {

		return _jadscChecklistLocalService.fetchJADSCChecklistByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscChecklistLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscChecklistLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscChecklistLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklist>
			getJADSC_ByAppId(long jadscApplicationId) {

		return _jadscChecklistLocalService.getJADSC_ByAppId(jadscApplicationId);
	}

	/**
	 * Returns the jadsc checklist with the primary key.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
			getJADSCChecklist(long jadscChecklistId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.getJADSCChecklist(jadscChecklistId);
	}

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist
	 * @throws PortalException if a matching jadsc checklist could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
			getJADSCChecklistByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.getJADSCChecklistByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of jadsc checklists
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklist>
			getJADSCChecklists(int start, int end) {

		return _jadscChecklistLocalService.getJADSCChecklists(start, end);
	}

	/**
	 * Returns all the jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @return the matching jadsc checklists, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklist>
			getJADSCChecklistsByUuidAndCompanyId(String uuid, long companyId) {

		return _jadscChecklistLocalService.getJADSCChecklistsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc checklists, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklist>
			getJADSCChecklistsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCChecklist> orderByComparator) {

		return _jadscChecklistLocalService.getJADSCChecklistsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc checklists.
	 *
	 * @return the number of jadsc checklists
	 */
	@Override
	public int getJADSCChecklistsCount() {
		return _jadscChecklistLocalService.getJADSCChecklistsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscChecklistLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc checklist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklist
		updateJADSCChecklist(
			com.nbp.jadsc.application.form.service.model.JADSCChecklist
				jadscChecklist) {

		return _jadscChecklistLocalService.updateJADSCChecklist(jadscChecklist);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscChecklistLocalService.getBasePersistence();
	}

	@Override
	public JADSCChecklistLocalService getWrappedService() {
		return _jadscChecklistLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCChecklistLocalService jadscChecklistLocalService) {

		_jadscChecklistLocalService = jadscChecklistLocalService;
	}

	private JADSCChecklistLocalService _jadscChecklistLocalService;

}