/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliFinalDeterException;
import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc appli final deter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeterUtil
 * @generated
 */
@ProviderType
public interface JadscAppliFinalDeterPersistence
	extends BasePersistence<JadscAppliFinalDeter> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscAppliFinalDeterUtil} to access the jadsc appli final deter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter findBygetJadsc_FD_CI(String caseId)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter fetchBygetJadsc_FD_CI(String caseId);

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter fetchBygetJadsc_FD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc appli final deter where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli final deter that was removed
	 */
	public JadscAppliFinalDeter removeBygetJadsc_FD_CI(String caseId)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Returns the number of jadsc appli final deters where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli final deters
	 */
	public int countBygetJadsc_FD_CI(String caseId);

	/**
	 * Returns all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome);

	/**
	 * Returns a range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @return the range of matching jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter findBygetJadsc_By_FD_First(
			String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter fetchBygetJadsc_By_FD_First(
		String Outcome,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator);

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter findBygetJadsc_By_FD_Last(
			String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public JadscAppliFinalDeter fetchBygetJadsc_By_FD_Last(
		String Outcome,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator);

	/**
	 * Returns the jadsc appli final deters before and after the current jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the current jadsc appli final deter
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public JadscAppliFinalDeter[] findBygetJadsc_By_FD_PrevAndNext(
			long jadscAppliFinalDeterId, String Outcome,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Removes all the jadsc appli final deters where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	public void removeBygetJadsc_By_FD(String Outcome);

	/**
	 * Returns the number of jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli final deters
	 */
	public int countBygetJadsc_By_FD(String Outcome);

	/**
	 * Caches the jadsc appli final deter in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 */
	public void cacheResult(JadscAppliFinalDeter jadscAppliFinalDeter);

	/**
	 * Caches the jadsc appli final deters in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeters the jadsc appli final deters
	 */
	public void cacheResult(
		java.util.List<JadscAppliFinalDeter> jadscAppliFinalDeters);

	/**
	 * Creates a new jadsc appli final deter with the primary key. Does not add the jadsc appli final deter to the database.
	 *
	 * @param jadscAppliFinalDeterId the primary key for the new jadsc appli final deter
	 * @return the new jadsc appli final deter
	 */
	public JadscAppliFinalDeter create(long jadscAppliFinalDeterId);

	/**
	 * Removes the jadsc appli final deter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public JadscAppliFinalDeter remove(long jadscAppliFinalDeterId)
		throws NoSuchJadscAppliFinalDeterException;

	public JadscAppliFinalDeter updateImpl(
		JadscAppliFinalDeter jadscAppliFinalDeter);

	/**
	 * Returns the jadsc appli final deter with the primary key or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public JadscAppliFinalDeter findByPrimaryKey(long jadscAppliFinalDeterId)
		throws NoSuchJadscAppliFinalDeterException;

	/**
	 * Returns the jadsc appli final deter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter, or <code>null</code> if a jadsc appli final deter with the primary key could not be found
	 */
	public JadscAppliFinalDeter fetchByPrimaryKey(long jadscAppliFinalDeterId);

	/**
	 * Returns all the jadsc appli final deters.
	 *
	 * @return the jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findAll();

	/**
	 * Returns a range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @return the range of jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli final deters
	 */
	public java.util.List<JadscAppliFinalDeter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscAppliFinalDeter>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc appli final deters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc appli final deters.
	 *
	 * @return the number of jadsc appli final deters
	 */
	public int countAll();

}