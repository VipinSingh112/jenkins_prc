/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationInitiateInvestigationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;
import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigationTable;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationInitiateInvestigationModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationInitiateInvestigationPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationInitiateInvestigationUtil;
import com.nbp.jadsc.stage.services.service.persistence.impl.constants.JADSC_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the jadsc application initiate investigation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscApplicationInitiateInvestigationPersistence.class)
public class JadscApplicationInitiateInvestigationPersistenceImpl
	extends BasePersistenceImpl<JadscApplicationInitiateInvestigation>
	implements JadscApplicationInitiateInvestigationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscApplicationInitiateInvestigationUtil</code> to access the jadsc application initiate investigation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscApplicationInitiateInvestigationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_II_CI;
	private FinderPath _finderPathCountBygetJadsc_II_CI;

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation findBygetJadsc_II_CI(
			String caseId)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = fetchBygetJadsc_II_CI(
				caseId);

		if (jadscApplicationInitiateInvestigation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscApplicationInitiateInvestigationException(
				sb.toString());
		}

		return jadscApplicationInitiateInvestigation;
	}

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId) {

		return fetchBygetJadsc_II_CI(caseId, true);
	}

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_II_CI, finderArgs, this);
		}

		if (result instanceof JadscApplicationInitiateInvestigation) {
			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation =
					(JadscApplicationInitiateInvestigation)result;

			if (!Objects.equals(
					caseId,
					jadscApplicationInitiateInvestigation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_II_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_II_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<JadscApplicationInitiateInvestigation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_II_CI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"JadscApplicationInitiateInvestigationPersistenceImpl.fetchBygetJadsc_II_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationInitiateInvestigation
						jadscApplicationInitiateInvestigation = list.get(0);

					result = jadscApplicationInitiateInvestigation;

					cacheResult(jadscApplicationInitiateInvestigation);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (JadscApplicationInitiateInvestigation)result;
		}
	}

	/**
	 * Removes the jadsc application initiate investigation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application initiate investigation that was removed
	 */
	@Override
	public JadscApplicationInitiateInvestigation removeBygetJadsc_II_CI(
			String caseId)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = findBygetJadsc_II_CI(
				caseId);

		return remove(jadscApplicationInitiateInvestigation);
	}

	/**
	 * Returns the number of jadsc application initiate investigations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application initiate investigations
	 */
	@Override
	public int countBygetJadsc_II_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_II_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_II_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_II_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETJADSC_II_CI_CASEID_2 =
		"jadscApplicationInitiateInvestigation.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_II_CI_CASEID_3 =
		"(jadscApplicationInitiateInvestigation.caseId IS NULL OR jadscApplicationInitiateInvestigation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_II;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_II;
	private FinderPath _finderPathCountBygetJadsc_By_II;

	/**
	 * Returns all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findBygetJadsc_By_II(
		String outcome) {

		return findBygetJadsc_By_II(
			outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of matching jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findBygetJadsc_By_II(
		String outcome, int start, int end) {

		return findBygetJadsc_By_II(outcome, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findBygetJadsc_By_II(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator) {

		return findBygetJadsc_By_II(
			outcome, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findBygetJadsc_By_II(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator,
		boolean useFinderCache) {

		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_II;
				finderArgs = new Object[] {outcome};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_II;
			finderArgs = new Object[] {outcome, start, end, orderByComparator};
		}

		List<JadscApplicationInitiateInvestigation> list = null;

		if (useFinderCache) {
			list =
				(List<JadscApplicationInitiateInvestigation>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationInitiateInvestigation
						jadscApplicationInitiateInvestigation : list) {

					if (!outcome.equals(
							jadscApplicationInitiateInvestigation.
								getOutcome())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					JadscApplicationInitiateInvestigationModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(outcome);
				}

				list =
					(List<JadscApplicationInitiateInvestigation>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation findBygetJadsc_By_II_First(
			String outcome,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = fetchBygetJadsc_By_II_First(
				outcome, orderByComparator);

		if (jadscApplicationInitiateInvestigation != null) {
			return jadscApplicationInitiateInvestigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscApplicationInitiateInvestigationException(
			sb.toString());
	}

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_By_II_First(
		String outcome,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator) {

		List<JadscApplicationInitiateInvestigation> list = findBygetJadsc_By_II(
			outcome, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation findBygetJadsc_By_II_Last(
			String outcome,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = fetchBygetJadsc_By_II_Last(
				outcome, orderByComparator);

		if (jadscApplicationInitiateInvestigation != null) {
			return jadscApplicationInitiateInvestigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscApplicationInitiateInvestigationException(
			sb.toString());
	}

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation fetchBygetJadsc_By_II_Last(
		String outcome,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator) {

		int count = countBygetJadsc_By_II(outcome);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationInitiateInvestigation> list = findBygetJadsc_By_II(
			outcome, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application initiate investigations before and after the current jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliInvestiId the primary key of the current jadsc application initiate investigation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation[]
			findBygetJadsc_By_II_PrevAndNext(
				long jadscAppliInvestiId, String outcome,
				OrderByComparator<JadscApplicationInitiateInvestigation>
					orderByComparator)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		outcome = Objects.toString(outcome, "");

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = findByPrimaryKey(
				jadscAppliInvestiId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationInitiateInvestigation[] array =
				new JadscApplicationInitiateInvestigationImpl[3];

			array[0] = getBygetJadsc_By_II_PrevAndNext(
				session, jadscApplicationInitiateInvestigation, outcome,
				orderByComparator, true);

			array[1] = jadscApplicationInitiateInvestigation;

			array[2] = getBygetJadsc_By_II_PrevAndNext(
				session, jadscApplicationInitiateInvestigation, outcome,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JadscApplicationInitiateInvestigation
		getBygetJadsc_By_II_PrevAndNext(
			Session session,
			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation,
			String outcome,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE);

		boolean bindOutcome = false;

		if (outcome.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_3);
		}
		else {
			bindOutcome = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				JadscApplicationInitiateInvestigationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindOutcome) {
			queryPos.add(outcome);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscApplicationInitiateInvestigation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationInitiateInvestigation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application initiate investigations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	@Override
	public void removeBygetJadsc_By_II(String outcome) {
		for (JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation :
					findBygetJadsc_By_II(
						outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplicationInitiateInvestigation);
		}
	}

	/**
	 * Returns the number of jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application initiate investigations
	 */
	@Override
	public int countBygetJadsc_By_II(String outcome) {
		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_II;

		Object[] finderArgs = new Object[] {outcome};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(outcome);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_2 =
		"jadscApplicationInitiateInvestigation.outcome = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_II_OUTCOME_3 =
		"(jadscApplicationInitiateInvestigation.outcome IS NULL OR jadscApplicationInitiateInvestigation.outcome = '')";

	public JadscApplicationInitiateInvestigationPersistenceImpl() {
		setModelClass(JadscApplicationInitiateInvestigation.class);

		setModelImplClass(JadscApplicationInitiateInvestigationImpl.class);
		setModelPKClass(long.class);

		setTable(JadscApplicationInitiateInvestigationTable.INSTANCE);
	}

	/**
	 * Caches the jadsc application initiate investigation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 */
	@Override
	public void cacheResult(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		entityCache.putResult(
			JadscApplicationInitiateInvestigationImpl.class,
			jadscApplicationInitiateInvestigation.getPrimaryKey(),
			jadscApplicationInitiateInvestigation);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_II_CI,
			new Object[] {jadscApplicationInitiateInvestigation.getCaseId()},
			jadscApplicationInitiateInvestigation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc application initiate investigations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigations the jadsc application initiate investigations
	 */
	@Override
	public void cacheResult(
		List<JadscApplicationInitiateInvestigation>
			jadscApplicationInitiateInvestigations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscApplicationInitiateInvestigations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation :
					jadscApplicationInitiateInvestigations) {

			if (entityCache.getResult(
					JadscApplicationInitiateInvestigationImpl.class,
					jadscApplicationInitiateInvestigation.getPrimaryKey()) ==
						null) {

				cacheResult(jadscApplicationInitiateInvestigation);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc application initiate investigations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscApplicationInitiateInvestigationImpl.class);

		finderCache.clearCache(JadscApplicationInitiateInvestigationImpl.class);
	}

	/**
	 * Clears the cache for the jadsc application initiate investigation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		entityCache.removeResult(
			JadscApplicationInitiateInvestigationImpl.class,
			jadscApplicationInitiateInvestigation);
	}

	@Override
	public void clearCache(
		List<JadscApplicationInitiateInvestigation>
			jadscApplicationInitiateInvestigations) {

		for (JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation :
					jadscApplicationInitiateInvestigations) {

			entityCache.removeResult(
				JadscApplicationInitiateInvestigationImpl.class,
				jadscApplicationInitiateInvestigation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscApplicationInitiateInvestigationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscApplicationInitiateInvestigationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscApplicationInitiateInvestigationModelImpl
			jadscApplicationInitiateInvestigationModelImpl) {

		Object[] args = new Object[] {
			jadscApplicationInitiateInvestigationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_II_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_II_CI, args,
			jadscApplicationInitiateInvestigationModelImpl);
	}

	/**
	 * Creates a new jadsc application initiate investigation with the primary key. Does not add the jadsc application initiate investigation to the database.
	 *
	 * @param jadscAppliInvestiId the primary key for the new jadsc application initiate investigation
	 * @return the new jadsc application initiate investigation
	 */
	@Override
	public JadscApplicationInitiateInvestigation create(
		long jadscAppliInvestiId) {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation =
				new JadscApplicationInitiateInvestigationImpl();

		jadscApplicationInitiateInvestigation.setNew(true);
		jadscApplicationInitiateInvestigation.setPrimaryKey(
			jadscAppliInvestiId);

		jadscApplicationInitiateInvestigation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscApplicationInitiateInvestigation;
	}

	/**
	 * Removes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation remove(
			long jadscAppliInvestiId)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		return remove((Serializable)jadscAppliInvestiId);
	}

	/**
	 * Removes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation remove(Serializable primaryKey)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		Session session = null;

		try {
			session = openSession();

			JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation =
					(JadscApplicationInitiateInvestigation)session.get(
						JadscApplicationInitiateInvestigationImpl.class,
						primaryKey);

			if (jadscApplicationInitiateInvestigation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscApplicationInitiateInvestigationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscApplicationInitiateInvestigation);
		}
		catch (NoSuchJadscApplicationInitiateInvestigationException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected JadscApplicationInitiateInvestigation removeImpl(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscApplicationInitiateInvestigation)) {
				jadscApplicationInitiateInvestigation =
					(JadscApplicationInitiateInvestigation)session.get(
						JadscApplicationInitiateInvestigationImpl.class,
						jadscApplicationInitiateInvestigation.
							getPrimaryKeyObj());
			}

			if (jadscApplicationInitiateInvestigation != null) {
				session.delete(jadscApplicationInitiateInvestigation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscApplicationInitiateInvestigation != null) {
			clearCache(jadscApplicationInitiateInvestigation);
		}

		return jadscApplicationInitiateInvestigation;
	}

	@Override
	public JadscApplicationInitiateInvestigation updateImpl(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		boolean isNew = jadscApplicationInitiateInvestigation.isNew();

		if (!(jadscApplicationInitiateInvestigation instanceof
				JadscApplicationInitiateInvestigationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					jadscApplicationInitiateInvestigation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscApplicationInitiateInvestigation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscApplicationInitiateInvestigation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscApplicationInitiateInvestigation implementation " +
					jadscApplicationInitiateInvestigation.getClass());
		}

		JadscApplicationInitiateInvestigationModelImpl
			jadscApplicationInitiateInvestigationModelImpl =
				(JadscApplicationInitiateInvestigationModelImpl)
					jadscApplicationInitiateInvestigation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(jadscApplicationInitiateInvestigation.getCreateDate() == null)) {

			if (serviceContext == null) {
				jadscApplicationInitiateInvestigation.setCreateDate(date);
			}
			else {
				jadscApplicationInitiateInvestigation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscApplicationInitiateInvestigationModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				jadscApplicationInitiateInvestigation.setModifiedDate(date);
			}
			else {
				jadscApplicationInitiateInvestigation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscApplicationInitiateInvestigation);
			}
			else {
				jadscApplicationInitiateInvestigation =
					(JadscApplicationInitiateInvestigation)session.merge(
						jadscApplicationInitiateInvestigation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscApplicationInitiateInvestigationImpl.class,
			jadscApplicationInitiateInvestigationModelImpl, false, true);

		cacheUniqueFindersCache(jadscApplicationInitiateInvestigationModelImpl);

		if (isNew) {
			jadscApplicationInitiateInvestigation.setNew(false);
		}

		jadscApplicationInitiateInvestigation.resetOriginalValues();

		return jadscApplicationInitiateInvestigation;
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation = fetchByPrimaryKey(
				primaryKey);

		if (jadscApplicationInitiateInvestigation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscApplicationInitiateInvestigationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscApplicationInitiateInvestigation;
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation findByPrimaryKey(
			long jadscAppliInvestiId)
		throws NoSuchJadscApplicationInitiateInvestigationException {

		return findByPrimaryKey((Serializable)jadscAppliInvestiId);
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation, or <code>null</code> if a jadsc application initiate investigation with the primary key could not be found
	 */
	@Override
	public JadscApplicationInitiateInvestigation fetchByPrimaryKey(
		long jadscAppliInvestiId) {

		return fetchByPrimaryKey((Serializable)jadscAppliInvestiId);
	}

	/**
	 * Returns all the jadsc application initiate investigations.
	 *
	 * @return the jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application initiate investigations
	 */
	@Override
	public List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<JadscApplicationInitiateInvestigation> list = null;

		if (useFinderCache) {
			list =
				(List<JadscApplicationInitiateInvestigation>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION;

				sql = sql.concat(
					JadscApplicationInitiateInvestigationModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<JadscApplicationInitiateInvestigation>)QueryUtil.list(
						query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the jadsc application initiate investigations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscApplicationInitiateInvestigation
				jadscApplicationInitiateInvestigation : findAll()) {

			remove(jadscApplicationInitiateInvestigation);
		}
	}

	/**
	 * Returns the number of jadsc application initiate investigations.
	 *
	 * @return the number of jadsc application initiate investigations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JADSCAPPLICATIONINITIATEINVESTIGATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "jadscAppliInvestiId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscApplicationInitiateInvestigationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc application initiate investigation persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetJadsc_II_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_II_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_II_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_II_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_II = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_II",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"outcome"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_II = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_II",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			true);

		_finderPathCountBygetJadsc_By_II = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_II",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			false);

		JadscApplicationInitiateInvestigationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscApplicationInitiateInvestigationUtil.setPersistence(null);

		entityCache.removeCache(
			JadscApplicationInitiateInvestigationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION =
			"SELECT jadscApplicationInitiateInvestigation FROM JadscApplicationInitiateInvestigation jadscApplicationInitiateInvestigation";

	private static final String
		_SQL_SELECT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE =
			"SELECT jadscApplicationInitiateInvestigation FROM JadscApplicationInitiateInvestigation jadscApplicationInitiateInvestigation WHERE ";

	private static final String
		_SQL_COUNT_JADSCAPPLICATIONINITIATEINVESTIGATION =
			"SELECT COUNT(jadscApplicationInitiateInvestigation) FROM JadscApplicationInitiateInvestigation jadscApplicationInitiateInvestigation";

	private static final String
		_SQL_COUNT_JADSCAPPLICATIONINITIATEINVESTIGATION_WHERE =
			"SELECT COUNT(jadscApplicationInitiateInvestigation) FROM JadscApplicationInitiateInvestigation jadscApplicationInitiateInvestigation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscApplicationInitiateInvestigation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscApplicationInitiateInvestigation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscApplicationInitiateInvestigation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscApplicationInitiateInvestigationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}