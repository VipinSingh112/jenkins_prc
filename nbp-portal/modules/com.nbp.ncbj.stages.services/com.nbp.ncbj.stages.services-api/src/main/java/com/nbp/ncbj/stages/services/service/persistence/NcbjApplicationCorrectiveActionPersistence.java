/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationCorrectiveActionException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj application corrective action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionUtil
 * @generated
 */
@ProviderType
public interface NcbjApplicationCorrectiveActionPersistence
	extends BasePersistence<NcbjApplicationCorrectiveAction> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjApplicationCorrectiveActionUtil} to access the ncbj application corrective action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a matching ncbj application corrective action could not be found
	 */
	public NcbjApplicationCorrectiveAction findBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchNcbjApplicationCorrectiveActionException;

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	public NcbjApplicationCorrectiveAction fetchBygetPreAPprovalConditionBy_CI(
		String caseId);

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	public NcbjApplicationCorrectiveAction fetchBygetPreAPprovalConditionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj application corrective action where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application corrective action that was removed
	 */
	public NcbjApplicationCorrectiveAction removeBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchNcbjApplicationCorrectiveActionException;

	/**
	 * Returns the number of ncbj application corrective actions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application corrective actions
	 */
	public int countBygetPreAPprovalConditionBy_CI(String caseId);

	/**
	 * Caches the ncbj application corrective action in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 */
	public void cacheResult(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction);

	/**
	 * Caches the ncbj application corrective actions in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveActions the ncbj application corrective actions
	 */
	public void cacheResult(
		java.util.List<NcbjApplicationCorrectiveAction>
			ncbjApplicationCorrectiveActions);

	/**
	 * Creates a new ncbj application corrective action with the primary key. Does not add the ncbj application corrective action to the database.
	 *
	 * @param ncbjAppCorrActionId the primary key for the new ncbj application corrective action
	 * @return the new ncbj application corrective action
	 */
	public NcbjApplicationCorrectiveAction create(long ncbjAppCorrActionId);

	/**
	 * Removes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	public NcbjApplicationCorrectiveAction remove(long ncbjAppCorrActionId)
		throws NoSuchNcbjApplicationCorrectiveActionException;

	public NcbjApplicationCorrectiveAction updateImpl(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction);

	/**
	 * Returns the ncbj application corrective action with the primary key or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	public NcbjApplicationCorrectiveAction findByPrimaryKey(
			long ncbjAppCorrActionId)
		throws NoSuchNcbjApplicationCorrectiveActionException;

	/**
	 * Returns the ncbj application corrective action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action, or <code>null</code> if a ncbj application corrective action with the primary key could not be found
	 */
	public NcbjApplicationCorrectiveAction fetchByPrimaryKey(
		long ncbjAppCorrActionId);

	/**
	 * Returns all the ncbj application corrective actions.
	 *
	 * @return the ncbj application corrective actions
	 */
	public java.util.List<NcbjApplicationCorrectiveAction> findAll();

	/**
	 * Returns a range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @return the range of ncbj application corrective actions
	 */
	public java.util.List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application corrective actions
	 */
	public java.util.List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjApplicationCorrectiveAction> orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application corrective actions
	 */
	public java.util.List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjApplicationCorrectiveAction> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj application corrective actions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj application corrective actions.
	 *
	 * @return the number of ncbj application corrective actions
	 */
	public int countAll();

}