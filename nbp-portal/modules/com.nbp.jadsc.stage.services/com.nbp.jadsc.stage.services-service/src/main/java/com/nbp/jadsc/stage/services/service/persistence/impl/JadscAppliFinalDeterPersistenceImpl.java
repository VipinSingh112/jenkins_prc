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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliFinalDeterException;
import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter;
import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeterTable;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliFinalDeterPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliFinalDeterUtil;
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
 * The persistence implementation for the jadsc appli final deter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscAppliFinalDeterPersistence.class)
public class JadscAppliFinalDeterPersistenceImpl
	extends BasePersistenceImpl<JadscAppliFinalDeter>
	implements JadscAppliFinalDeterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscAppliFinalDeterUtil</code> to access the jadsc appli final deter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscAppliFinalDeterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_FD_CI;
	private FinderPath _finderPathCountBygetJadsc_FD_CI;

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter findBygetJadsc_FD_CI(String caseId)
		throws NoSuchJadscAppliFinalDeterException {

		JadscAppliFinalDeter jadscAppliFinalDeter = fetchBygetJadsc_FD_CI(
			caseId);

		if (jadscAppliFinalDeter == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscAppliFinalDeterException(sb.toString());
		}

		return jadscAppliFinalDeter;
	}

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter fetchBygetJadsc_FD_CI(String caseId) {
		return fetchBygetJadsc_FD_CI(caseId, true);
	}

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter fetchBygetJadsc_FD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_FD_CI, finderArgs, this);
		}

		if (result instanceof JadscAppliFinalDeter) {
			JadscAppliFinalDeter jadscAppliFinalDeter =
				(JadscAppliFinalDeter)result;

			if (!Objects.equals(caseId, jadscAppliFinalDeter.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLIFINALDETER_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_FD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_FD_CI_CASEID_2);
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

				List<JadscAppliFinalDeter> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_FD_CI, finderArgs, list);
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
								"JadscAppliFinalDeterPersistenceImpl.fetchBygetJadsc_FD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscAppliFinalDeter jadscAppliFinalDeter = list.get(0);

					result = jadscAppliFinalDeter;

					cacheResult(jadscAppliFinalDeter);
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
			return (JadscAppliFinalDeter)result;
		}
	}

	/**
	 * Removes the jadsc appli final deter where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli final deter that was removed
	 */
	@Override
	public JadscAppliFinalDeter removeBygetJadsc_FD_CI(String caseId)
		throws NoSuchJadscAppliFinalDeterException {

		JadscAppliFinalDeter jadscAppliFinalDeter = findBygetJadsc_FD_CI(
			caseId);

		return remove(jadscAppliFinalDeter);
	}

	/**
	 * Returns the number of jadsc appli final deters where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli final deters
	 */
	@Override
	public int countBygetJadsc_FD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_FD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIFINALDETER_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_FD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_FD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_FD_CI_CASEID_2 =
		"jadscAppliFinalDeter.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_FD_CI_CASEID_3 =
		"(jadscAppliFinalDeter.caseId IS NULL OR jadscAppliFinalDeter.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_FD;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_FD;
	private FinderPath _finderPathCountBygetJadsc_By_FD;

	/**
	 * Returns all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli final deters
	 */
	@Override
	public List<JadscAppliFinalDeter> findBygetJadsc_By_FD(String Outcome) {
		return findBygetJadsc_By_FD(
			Outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end) {

		return findBygetJadsc_By_FD(Outcome, start, end, null);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return findBygetJadsc_By_FD(
			Outcome, start, end, orderByComparator, true);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator,
		boolean useFinderCache) {

		Outcome = Objects.toString(Outcome, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_FD;
				finderArgs = new Object[] {Outcome};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_FD;
			finderArgs = new Object[] {Outcome, start, end, orderByComparator};
		}

		List<JadscAppliFinalDeter> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliFinalDeter>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscAppliFinalDeter jadscAppliFinalDeter : list) {
					if (!Outcome.equals(jadscAppliFinalDeter.getOutcome())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLIFINALDETER_WHERE);

			boolean bindOutcome = false;

			if (Outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscAppliFinalDeterModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(Outcome);
				}

				list = (List<JadscAppliFinalDeter>)QueryUtil.list(
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
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter findBygetJadsc_By_FD_First(
			String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException {

		JadscAppliFinalDeter jadscAppliFinalDeter = fetchBygetJadsc_By_FD_First(
			Outcome, orderByComparator);

		if (jadscAppliFinalDeter != null) {
			return jadscAppliFinalDeter;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Outcome=");
		sb.append(Outcome);

		sb.append("}");

		throw new NoSuchJadscAppliFinalDeterException(sb.toString());
	}

	/**
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter fetchBygetJadsc_By_FD_First(
		String Outcome,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		List<JadscAppliFinalDeter> list = findBygetJadsc_By_FD(
			Outcome, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter findBygetJadsc_By_FD_Last(
			String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException {

		JadscAppliFinalDeter jadscAppliFinalDeter = fetchBygetJadsc_By_FD_Last(
			Outcome, orderByComparator);

		if (jadscAppliFinalDeter != null) {
			return jadscAppliFinalDeter;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Outcome=");
		sb.append(Outcome);

		sb.append("}");

		throw new NoSuchJadscAppliFinalDeterException(sb.toString());
	}

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	@Override
	public JadscAppliFinalDeter fetchBygetJadsc_By_FD_Last(
		String Outcome,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		int count = countBygetJadsc_By_FD(Outcome);

		if (count == 0) {
			return null;
		}

		List<JadscAppliFinalDeter> list = findBygetJadsc_By_FD(
			Outcome, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc appli final deters before and after the current jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the current jadsc appli final deter
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter[] findBygetJadsc_By_FD_PrevAndNext(
			long jadscAppliFinalDeterId, String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws NoSuchJadscAppliFinalDeterException {

		Outcome = Objects.toString(Outcome, "");

		JadscAppliFinalDeter jadscAppliFinalDeter = findByPrimaryKey(
			jadscAppliFinalDeterId);

		Session session = null;

		try {
			session = openSession();

			JadscAppliFinalDeter[] array = new JadscAppliFinalDeterImpl[3];

			array[0] = getBygetJadsc_By_FD_PrevAndNext(
				session, jadscAppliFinalDeter, Outcome, orderByComparator,
				true);

			array[1] = jadscAppliFinalDeter;

			array[2] = getBygetJadsc_By_FD_PrevAndNext(
				session, jadscAppliFinalDeter, Outcome, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JadscAppliFinalDeter getBygetJadsc_By_FD_PrevAndNext(
		Session session, JadscAppliFinalDeter jadscAppliFinalDeter,
		String Outcome,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLIFINALDETER_WHERE);

		boolean bindOutcome = false;

		if (Outcome.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_3);
		}
		else {
			bindOutcome = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_2);
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
			sb.append(JadscAppliFinalDeterModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindOutcome) {
			queryPos.add(Outcome);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscAppliFinalDeter)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscAppliFinalDeter> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc appli final deters where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	@Override
	public void removeBygetJadsc_By_FD(String Outcome) {
		for (JadscAppliFinalDeter jadscAppliFinalDeter :
				findBygetJadsc_By_FD(
					Outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscAppliFinalDeter);
		}
	}

	/**
	 * Returns the number of jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli final deters
	 */
	@Override
	public int countBygetJadsc_By_FD(String Outcome) {
		Outcome = Objects.toString(Outcome, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_FD;

		Object[] finderArgs = new Object[] {Outcome};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIFINALDETER_WHERE);

			boolean bindOutcome = false;

			if (Outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOutcome) {
					queryPos.add(Outcome);
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

	private static final String _FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_2 =
		"jadscAppliFinalDeter.Outcome = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_FD_OUTCOME_3 =
		"(jadscAppliFinalDeter.Outcome IS NULL OR jadscAppliFinalDeter.Outcome = '')";

	public JadscAppliFinalDeterPersistenceImpl() {
		setModelClass(JadscAppliFinalDeter.class);

		setModelImplClass(JadscAppliFinalDeterImpl.class);
		setModelPKClass(long.class);

		setTable(JadscAppliFinalDeterTable.INSTANCE);
	}

	/**
	 * Caches the jadsc appli final deter in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 */
	@Override
	public void cacheResult(JadscAppliFinalDeter jadscAppliFinalDeter) {
		entityCache.putResult(
			JadscAppliFinalDeterImpl.class,
			jadscAppliFinalDeter.getPrimaryKey(), jadscAppliFinalDeter);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_FD_CI,
			new Object[] {jadscAppliFinalDeter.getCaseId()},
			jadscAppliFinalDeter);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc appli final deters in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeters the jadsc appli final deters
	 */
	@Override
	public void cacheResult(List<JadscAppliFinalDeter> jadscAppliFinalDeters) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscAppliFinalDeters.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscAppliFinalDeter jadscAppliFinalDeter :
				jadscAppliFinalDeters) {

			if (entityCache.getResult(
					JadscAppliFinalDeterImpl.class,
					jadscAppliFinalDeter.getPrimaryKey()) == null) {

				cacheResult(jadscAppliFinalDeter);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc appli final deters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscAppliFinalDeterImpl.class);

		finderCache.clearCache(JadscAppliFinalDeterImpl.class);
	}

	/**
	 * Clears the cache for the jadsc appli final deter.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JadscAppliFinalDeter jadscAppliFinalDeter) {
		entityCache.removeResult(
			JadscAppliFinalDeterImpl.class, jadscAppliFinalDeter);
	}

	@Override
	public void clearCache(List<JadscAppliFinalDeter> jadscAppliFinalDeters) {
		for (JadscAppliFinalDeter jadscAppliFinalDeter :
				jadscAppliFinalDeters) {

			entityCache.removeResult(
				JadscAppliFinalDeterImpl.class, jadscAppliFinalDeter);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscAppliFinalDeterImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscAppliFinalDeterImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscAppliFinalDeterModelImpl jadscAppliFinalDeterModelImpl) {

		Object[] args = new Object[] {
			jadscAppliFinalDeterModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_FD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_FD_CI, args,
			jadscAppliFinalDeterModelImpl);
	}

	/**
	 * Creates a new jadsc appli final deter with the primary key. Does not add the jadsc appli final deter to the database.
	 *
	 * @param jadscAppliFinalDeterId the primary key for the new jadsc appli final deter
	 * @return the new jadsc appli final deter
	 */
	@Override
	public JadscAppliFinalDeter create(long jadscAppliFinalDeterId) {
		JadscAppliFinalDeter jadscAppliFinalDeter =
			new JadscAppliFinalDeterImpl();

		jadscAppliFinalDeter.setNew(true);
		jadscAppliFinalDeter.setPrimaryKey(jadscAppliFinalDeterId);

		jadscAppliFinalDeter.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscAppliFinalDeter;
	}

	/**
	 * Removes the jadsc appli final deter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter remove(long jadscAppliFinalDeterId)
		throws NoSuchJadscAppliFinalDeterException {

		return remove((Serializable)jadscAppliFinalDeterId);
	}

	/**
	 * Removes the jadsc appli final deter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter remove(Serializable primaryKey)
		throws NoSuchJadscAppliFinalDeterException {

		Session session = null;

		try {
			session = openSession();

			JadscAppliFinalDeter jadscAppliFinalDeter =
				(JadscAppliFinalDeter)session.get(
					JadscAppliFinalDeterImpl.class, primaryKey);

			if (jadscAppliFinalDeter == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscAppliFinalDeterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscAppliFinalDeter);
		}
		catch (NoSuchJadscAppliFinalDeterException noSuchEntityException) {
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
	protected JadscAppliFinalDeter removeImpl(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscAppliFinalDeter)) {
				jadscAppliFinalDeter = (JadscAppliFinalDeter)session.get(
					JadscAppliFinalDeterImpl.class,
					jadscAppliFinalDeter.getPrimaryKeyObj());
			}

			if (jadscAppliFinalDeter != null) {
				session.delete(jadscAppliFinalDeter);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscAppliFinalDeter != null) {
			clearCache(jadscAppliFinalDeter);
		}

		return jadscAppliFinalDeter;
	}

	@Override
	public JadscAppliFinalDeter updateImpl(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		boolean isNew = jadscAppliFinalDeter.isNew();

		if (!(jadscAppliFinalDeter instanceof JadscAppliFinalDeterModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscAppliFinalDeter.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscAppliFinalDeter);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscAppliFinalDeter proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscAppliFinalDeter implementation " +
					jadscAppliFinalDeter.getClass());
		}

		JadscAppliFinalDeterModelImpl jadscAppliFinalDeterModelImpl =
			(JadscAppliFinalDeterModelImpl)jadscAppliFinalDeter;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscAppliFinalDeter.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscAppliFinalDeter.setCreateDate(date);
			}
			else {
				jadscAppliFinalDeter.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscAppliFinalDeterModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscAppliFinalDeter.setModifiedDate(date);
			}
			else {
				jadscAppliFinalDeter.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscAppliFinalDeter);
			}
			else {
				jadscAppliFinalDeter = (JadscAppliFinalDeter)session.merge(
					jadscAppliFinalDeter);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscAppliFinalDeterImpl.class, jadscAppliFinalDeterModelImpl,
			false, true);

		cacheUniqueFindersCache(jadscAppliFinalDeterModelImpl);

		if (isNew) {
			jadscAppliFinalDeter.setNew(false);
		}

		jadscAppliFinalDeter.resetOriginalValues();

		return jadscAppliFinalDeter;
	}

	/**
	 * Returns the jadsc appli final deter with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJadscAppliFinalDeterException {

		JadscAppliFinalDeter jadscAppliFinalDeter = fetchByPrimaryKey(
			primaryKey);

		if (jadscAppliFinalDeter == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscAppliFinalDeterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscAppliFinalDeter;
	}

	/**
	 * Returns the jadsc appli final deter with the primary key or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter findByPrimaryKey(long jadscAppliFinalDeterId)
		throws NoSuchJadscAppliFinalDeterException {

		return findByPrimaryKey((Serializable)jadscAppliFinalDeterId);
	}

	/**
	 * Returns the jadsc appli final deter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter, or <code>null</code> if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public JadscAppliFinalDeter fetchByPrimaryKey(long jadscAppliFinalDeterId) {
		return fetchByPrimaryKey((Serializable)jadscAppliFinalDeterId);
	}

	/**
	 * Returns all the jadsc appli final deters.
	 *
	 * @return the jadsc appli final deters
	 */
	@Override
	public List<JadscAppliFinalDeter> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findAll(
		int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<JadscAppliFinalDeter> findAll(
		int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator,
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

		List<JadscAppliFinalDeter> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliFinalDeter>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLIFINALDETER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLIFINALDETER;

				sql = sql.concat(JadscAppliFinalDeterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscAppliFinalDeter>)QueryUtil.list(
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
	 * Removes all the jadsc appli final deters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscAppliFinalDeter jadscAppliFinalDeter : findAll()) {
			remove(jadscAppliFinalDeter);
		}
	}

	/**
	 * Returns the number of jadsc appli final deters.
	 *
	 * @return the number of jadsc appli final deters
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
					_SQL_COUNT_JADSCAPPLIFINALDETER);

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
		return "jadscAppliFinalDeterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLIFINALDETER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscAppliFinalDeterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc appli final deter persistence.
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

		_finderPathFetchBygetJadsc_FD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_FD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_FD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_FD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_FD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_FD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Outcome"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_FD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_FD",
			new String[] {String.class.getName()}, new String[] {"Outcome"},
			true);

		_finderPathCountBygetJadsc_By_FD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_FD",
			new String[] {String.class.getName()}, new String[] {"Outcome"},
			false);

		JadscAppliFinalDeterUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscAppliFinalDeterUtil.setPersistence(null);

		entityCache.removeCache(JadscAppliFinalDeterImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCAPPLIFINALDETER =
		"SELECT jadscAppliFinalDeter FROM JadscAppliFinalDeter jadscAppliFinalDeter";

	private static final String _SQL_SELECT_JADSCAPPLIFINALDETER_WHERE =
		"SELECT jadscAppliFinalDeter FROM JadscAppliFinalDeter jadscAppliFinalDeter WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLIFINALDETER =
		"SELECT COUNT(jadscAppliFinalDeter) FROM JadscAppliFinalDeter jadscAppliFinalDeter";

	private static final String _SQL_COUNT_JADSCAPPLIFINALDETER_WHERE =
		"SELECT COUNT(jadscAppliFinalDeter) FROM JadscAppliFinalDeter jadscAppliFinalDeter WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscAppliFinalDeter.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscAppliFinalDeter exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscAppliFinalDeter exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscAppliFinalDeterPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}