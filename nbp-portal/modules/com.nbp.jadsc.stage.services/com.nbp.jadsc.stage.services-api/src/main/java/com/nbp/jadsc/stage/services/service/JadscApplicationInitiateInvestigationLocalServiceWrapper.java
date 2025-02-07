/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscApplicationInitiateInvestigationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigationLocalService
 * @generated
 */
public class JadscApplicationInitiateInvestigationLocalServiceWrapper
	implements JadscApplicationInitiateInvestigationLocalService,
			   ServiceWrapper
				   <JadscApplicationInitiateInvestigationLocalService> {

	public JadscApplicationInitiateInvestigationLocalServiceWrapper() {
		this(null);
	}

	public JadscApplicationInitiateInvestigationLocalServiceWrapper(
		JadscApplicationInitiateInvestigationLocalService
			jadscApplicationInitiateInvestigationLocalService) {

		_jadscApplicationInitiateInvestigationLocalService =
			jadscApplicationInitiateInvestigationLocalService;
	}

	/**
	 * Adds the jadsc application initiate investigation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was added
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			addJadscApplicationInitiateInvestigation(
				com.nbp.jadsc.stage.services.model.
					JadscApplicationInitiateInvestigation
						jadscApplicationInitiateInvestigation) {

		return _jadscApplicationInitiateInvestigationLocalService.
			addJadscApplicationInitiateInvestigation(
				jadscApplicationInitiateInvestigation);
	}

	/**
	 * Creates a new jadsc application initiate investigation with the primary key. Does not add the jadsc application initiate investigation to the database.
	 *
	 * @param jadscAppliInvestiId the primary key for the new jadsc application initiate investigation
	 * @return the new jadsc application initiate investigation
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			createJadscApplicationInitiateInvestigation(
				long jadscAppliInvestiId) {

		return _jadscApplicationInitiateInvestigationLocalService.
			createJadscApplicationInitiateInvestigation(jadscAppliInvestiId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationInitiateInvestigationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jadsc application initiate investigation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			deleteJadscApplicationInitiateInvestigation(
				com.nbp.jadsc.stage.services.model.
					JadscApplicationInitiateInvestigation
						jadscApplicationInitiateInvestigation) {

		return _jadscApplicationInitiateInvestigationLocalService.
			deleteJadscApplicationInitiateInvestigation(
				jadscApplicationInitiateInvestigation);
	}

	/**
	 * Deletes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws PortalException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
				deleteJadscApplicationInitiateInvestigation(
					long jadscAppliInvestiId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationInitiateInvestigationLocalService.
			deleteJadscApplicationInitiateInvestigation(jadscAppliInvestiId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationInitiateInvestigationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscApplicationInitiateInvestigationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscApplicationInitiateInvestigationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscApplicationInitiateInvestigationLocalService.
			dynamicQuery();
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

		return _jadscApplicationInitiateInvestigationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
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

		return _jadscApplicationInitiateInvestigationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
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

		return _jadscApplicationInitiateInvestigationLocalService.dynamicQuery(
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

		return _jadscApplicationInitiateInvestigationLocalService.
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

		return _jadscApplicationInitiateInvestigationLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			fetchJadscApplicationInitiateInvestigation(
				long jadscAppliInvestiId) {

		return _jadscApplicationInitiateInvestigationLocalService.
			fetchJadscApplicationInitiateInvestigation(jadscAppliInvestiId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscApplicationInitiateInvestigationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscApplicationInitiateInvestigationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws PortalException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
				getJadscApplicationInitiateInvestigation(
					long jadscAppliInvestiId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationInitiateInvestigationLocalService.
			getJadscApplicationInitiateInvestigation(jadscAppliInvestiId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.
			JadscApplicationInitiateInvestigation>
				getJadscApplicationInitiateInvestigationBy_List_CI(
					String outcome) {

		return _jadscApplicationInitiateInvestigationLocalService.
			getJadscApplicationInitiateInvestigationBy_List_CI(outcome);
	}

	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
				getJadscApplicationInitiateInvestigationByCI(String caseId)
			throws com.nbp.jadsc.stage.services.exception.
				NoSuchJadscApplicationInitiateInvestigationException {

		return _jadscApplicationInitiateInvestigationLocalService.
			getJadscApplicationInitiateInvestigationByCI(caseId);
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of jadsc application initiate investigations
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.
			JadscApplicationInitiateInvestigation>
				getJadscApplicationInitiateInvestigations(int start, int end) {

		return _jadscApplicationInitiateInvestigationLocalService.
			getJadscApplicationInitiateInvestigations(start, end);
	}

	/**
	 * Returns the number of jadsc application initiate investigations.
	 *
	 * @return the number of jadsc application initiate investigations
	 */
	@Override
	public int getJadscApplicationInitiateInvestigationsCount() {
		return _jadscApplicationInitiateInvestigationLocalService.
			getJadscApplicationInitiateInvestigationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationInitiateInvestigationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationInitiateInvestigationLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc application initiate investigation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationInitiateInvestigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was updated
	 */
	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			updateJadscApplicationInitiateInvestigation(
				com.nbp.jadsc.stage.services.model.
					JadscApplicationInitiateInvestigation
						jadscApplicationInitiateInvestigation) {

		return _jadscApplicationInitiateInvestigationLocalService.
			updateJadscApplicationInitiateInvestigation(
				jadscApplicationInitiateInvestigation);
	}

	@Override
	public
		com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation
			updateJadscApplicationInitiateInvestigation(
				String caseId, java.util.Date dateOfInitiationInvestrigation,
				String outcome) {

		return _jadscApplicationInitiateInvestigationLocalService.
			updateJadscApplicationInitiateInvestigation(
				caseId, dateOfInitiationInvestrigation, outcome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscApplicationInitiateInvestigationLocalService.
			getBasePersistence();
	}

	@Override
	public JadscApplicationInitiateInvestigationLocalService
		getWrappedService() {

		return _jadscApplicationInitiateInvestigationLocalService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationInitiateInvestigationLocalService
			jadscApplicationInitiateInvestigationLocalService) {

		_jadscApplicationInitiateInvestigationLocalService =
			jadscApplicationInitiateInvestigationLocalService;
	}

	private JadscApplicationInitiateInvestigationLocalService
		_jadscApplicationInitiateInvestigationLocalService;

}