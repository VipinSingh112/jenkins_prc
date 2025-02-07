/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPreApprovalConditionsException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status pre approval conditions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsUtil
 * @generated
 */
@ProviderType
public interface SezStatusPreApprovalConditionsPersistence
	extends BasePersistence<SezStatusPreApprovalConditions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusPreApprovalConditionsUtil} to access the sez status pre approval conditions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a matching sez status pre approval conditions could not be found
	 */
	public SezStatusPreApprovalConditions findBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchSezStatusPreApprovalConditionsException;

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	public SezStatusPreApprovalConditions fetchBygetPreAPprovalConditionBy_CI(
		String caseId);

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	public SezStatusPreApprovalConditions fetchBygetPreAPprovalConditionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status pre approval conditions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status pre approval conditions that was removed
	 */
	public SezStatusPreApprovalConditions removeBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchSezStatusPreApprovalConditionsException;

	/**
	 * Returns the number of sez status pre approval conditionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status pre approval conditionses
	 */
	public int countBygetPreAPprovalConditionBy_CI(String caseId);

	/**
	 * Caches the sez status pre approval conditions in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 */
	public void cacheResult(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions);

	/**
	 * Caches the sez status pre approval conditionses in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditionses the sez status pre approval conditionses
	 */
	public void cacheResult(
		java.util.List<SezStatusPreApprovalConditions>
			sezStatusPreApprovalConditionses);

	/**
	 * Creates a new sez status pre approval conditions with the primary key. Does not add the sez status pre approval conditions to the database.
	 *
	 * @param preApprovalId the primary key for the new sez status pre approval conditions
	 * @return the new sez status pre approval conditions
	 */
	public SezStatusPreApprovalConditions create(long preApprovalId);

	/**
	 * Removes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	public SezStatusPreApprovalConditions remove(long preApprovalId)
		throws NoSuchSezStatusPreApprovalConditionsException;

	public SezStatusPreApprovalConditions updateImpl(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions);

	/**
	 * Returns the sez status pre approval conditions with the primary key or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	public SezStatusPreApprovalConditions findByPrimaryKey(long preApprovalId)
		throws NoSuchSezStatusPreApprovalConditionsException;

	/**
	 * Returns the sez status pre approval conditions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions, or <code>null</code> if a sez status pre approval conditions with the primary key could not be found
	 */
	public SezStatusPreApprovalConditions fetchByPrimaryKey(long preApprovalId);

	/**
	 * Returns all the sez status pre approval conditionses.
	 *
	 * @return the sez status pre approval conditionses
	 */
	public java.util.List<SezStatusPreApprovalConditions> findAll();

	/**
	 * Returns a range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @return the range of sez status pre approval conditionses
	 */
	public java.util.List<SezStatusPreApprovalConditions> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status pre approval conditionses
	 */
	public java.util.List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusPreApprovalConditions> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status pre approval conditionses
	 */
	public java.util.List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusPreApprovalConditions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status pre approval conditionses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status pre approval conditionses.
	 *
	 * @return the number of sez status pre approval conditionses
	 */
	public int countAll();

}