/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WRAApplicationDueDiligenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligenceLocalService
 * @generated
 */
public class WRAApplicationDueDiligenceLocalServiceWrapper
	implements ServiceWrapper<WRAApplicationDueDiligenceLocalService>,
			   WRAApplicationDueDiligenceLocalService {

	public WRAApplicationDueDiligenceLocalServiceWrapper() {
		this(null);
	}

	public WRAApplicationDueDiligenceLocalServiceWrapper(
		WRAApplicationDueDiligenceLocalService
			wraApplicationDueDiligenceLocalService) {

		_wraApplicationDueDiligenceLocalService =
			wraApplicationDueDiligenceLocalService;
	}

	/**
	 * Adds the wra application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		addWRAApplicationDueDiligence(
			com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
				wraApplicationDueDiligence) {

		return _wraApplicationDueDiligenceLocalService.
			addWRAApplicationDueDiligence(wraApplicationDueDiligence);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDueDiligenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra application due diligence with the primary key. Does not add the wra application due diligence to the database.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key for the new wra application due diligence
	 * @return the new wra application due diligence
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		createWRAApplicationDueDiligence(long wRAApplicationDueDiligenceId) {

		return _wraApplicationDueDiligenceLocalService.
			createWRAApplicationDueDiligence(wRAApplicationDueDiligenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDueDiligenceLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws PortalException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
			deleteWRAApplicationDueDiligence(long wRAApplicationDueDiligenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDueDiligenceLocalService.
			deleteWRAApplicationDueDiligence(wRAApplicationDueDiligenceId);
	}

	/**
	 * Deletes the wra application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		deleteWRAApplicationDueDiligence(
			com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
				wraApplicationDueDiligence) {

		return _wraApplicationDueDiligenceLocalService.
			deleteWRAApplicationDueDiligence(wraApplicationDueDiligence);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraApplicationDueDiligenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraApplicationDueDiligenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraApplicationDueDiligenceLocalService.dynamicQuery();
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

		return _wraApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
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

		return _wraApplicationDueDiligenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
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

		return _wraApplicationDueDiligenceLocalService.dynamicQuery(
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

		return _wraApplicationDueDiligenceLocalService.dynamicQueryCount(
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

		return _wraApplicationDueDiligenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		fetchWRAApplicationDueDiligence(long wRAApplicationDueDiligenceId) {

		return _wraApplicationDueDiligenceLocalService.
			fetchWRAApplicationDueDiligence(wRAApplicationDueDiligenceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraApplicationDueDiligenceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraApplicationDueDiligenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationDueDiligenceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDueDiligenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the wra application due diligence with the primary key.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws PortalException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
			getWRAApplicationDueDiligence(long wRAApplicationDueDiligenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationDueDiligenceLocalService.
			getWRAApplicationDueDiligence(wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns a range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of wra application due diligences
	 */
	@Override
	public java.util.List
		<com.nbp.wra.stage.service.model.WRAApplicationDueDiligence>
			getWRAApplicationDueDiligences(int start, int end) {

		return _wraApplicationDueDiligenceLocalService.
			getWRAApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of wra application due diligences.
	 *
	 * @return the number of wra application due diligences
	 */
	@Override
	public int getWRAApplicationDueDiligencesCount() {
		return _wraApplicationDueDiligenceLocalService.
			getWRAApplicationDueDiligencesCount();
	}

	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		getWRApplicationDueDiligenceByCI(String caseId) {

		return _wraApplicationDueDiligenceLocalService.
			getWRApplicationDueDiligenceByCI(caseId);
	}

	/**
	 * Updates the wra application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		updateWRAApplicationDueDiligence(
			com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
				wraApplicationDueDiligence) {

		return _wraApplicationDueDiligenceLocalService.
			updateWRAApplicationDueDiligence(wraApplicationDueDiligence);
	}

	@Override
	public com.nbp.wra.stage.service.model.WRAApplicationDueDiligence
		updateWRApplicationDueDiligence(
			String caseId, String agencyName, String status,
			String agencyDecision, String feedback) {

		return _wraApplicationDueDiligenceLocalService.
			updateWRApplicationDueDiligence(
				caseId, agencyName, status, agencyDecision, feedback);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraApplicationDueDiligenceLocalService.getBasePersistence();
	}

	@Override
	public WRAApplicationDueDiligenceLocalService getWrappedService() {
		return _wraApplicationDueDiligenceLocalService;
	}

	@Override
	public void setWrappedService(
		WRAApplicationDueDiligenceLocalService
			wraApplicationDueDiligenceLocalService) {

		_wraApplicationDueDiligenceLocalService =
			wraApplicationDueDiligenceLocalService;
	}

	private WRAApplicationDueDiligenceLocalService
		_wraApplicationDueDiligenceLocalService;

}