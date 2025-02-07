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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliPreliminationDeteException;
import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;
import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDeteTable;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreliminationDetePersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreliminationDeteUtil;
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
 * The persistence implementation for the jadsc appli prelimination dete service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscAppliPreliminationDetePersistence.class)
public class JadscAppliPreliminationDetePersistenceImpl
	extends BasePersistenceImpl<JadscAppliPreliminationDete>
	implements JadscAppliPreliminationDetePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscAppliPreliminationDeteUtil</code> to access the jadsc appli prelimination dete persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscAppliPreliminationDeteImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_PD_CI;
	private FinderPath _finderPathCountBygetJadsc_PD_CI;

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete findBygetJadsc_PD_CI(String caseId)
		throws NoSuchJadscAppliPreliminationDeteException {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			fetchBygetJadsc_PD_CI(caseId);

		if (jadscAppliPreliminationDete == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscAppliPreliminationDeteException(sb.toString());
		}

		return jadscAppliPreliminationDete;
	}

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(String caseId) {
		return fetchBygetJadsc_PD_CI(caseId, true);
	}

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_PD_CI, finderArgs, this);
		}

		if (result instanceof JadscAppliPreliminationDete) {
			JadscAppliPreliminationDete jadscAppliPreliminationDete =
				(JadscAppliPreliminationDete)result;

			if (!Objects.equals(
					caseId, jadscAppliPreliminationDete.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PD_CI_CASEID_2);
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

				List<JadscAppliPreliminationDete> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_PD_CI, finderArgs, list);
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
								"JadscAppliPreliminationDetePersistenceImpl.fetchBygetJadsc_PD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscAppliPreliminationDete jadscAppliPreliminationDete =
						list.get(0);

					result = jadscAppliPreliminationDete;

					cacheResult(jadscAppliPreliminationDete);
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
			return (JadscAppliPreliminationDete)result;
		}
	}

	/**
	 * Removes the jadsc appli prelimination dete where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli prelimination dete that was removed
	 */
	@Override
	public JadscAppliPreliminationDete removeBygetJadsc_PD_CI(String caseId)
		throws NoSuchJadscAppliPreliminationDeteException {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			findBygetJadsc_PD_CI(caseId);

		return remove(jadscAppliPreliminationDete);
	}

	/**
	 * Returns the number of jadsc appli prelimination detes where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli prelimination detes
	 */
	@Override
	public int countBygetJadsc_PD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_PD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIPRELIMINATIONDETE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_PD_CI_CASEID_2 =
		"jadscAppliPreliminationDete.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_PD_CI_CASEID_3 =
		"(jadscAppliPreliminationDete.caseId IS NULL OR jadscAppliPreliminationDete.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_PD;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_PD;
	private FinderPath _finderPathCountBygetJadsc_By_PD;

	/**
	 * Returns all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome) {

		return findBygetJadsc_By_PD(
			Outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of matching jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end) {

		return findBygetJadsc_By_PD(Outcome, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return findBygetJadsc_By_PD(
			Outcome, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator,
		boolean useFinderCache) {

		Outcome = Objects.toString(Outcome, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_PD;
				finderArgs = new Object[] {Outcome};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_PD;
			finderArgs = new Object[] {Outcome, start, end, orderByComparator};
		}

		List<JadscAppliPreliminationDete> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliPreliminationDete>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscAppliPreliminationDete jadscAppliPreliminationDete :
						list) {

					if (!Outcome.equals(
							jadscAppliPreliminationDete.getOutcome())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE_WHERE);

			boolean bindOutcome = false;

			if (Outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscAppliPreliminationDeteModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscAppliPreliminationDete>)QueryUtil.list(
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
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete findBygetJadsc_By_PD_First(
			String Outcome,
			OrderByComparator<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			fetchBygetJadsc_By_PD_First(Outcome, orderByComparator);

		if (jadscAppliPreliminationDete != null) {
			return jadscAppliPreliminationDete;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Outcome=");
		sb.append(Outcome);

		sb.append("}");

		throw new NoSuchJadscAppliPreliminationDeteException(sb.toString());
	}

	/**
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete fetchBygetJadsc_By_PD_First(
		String Outcome,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		List<JadscAppliPreliminationDete> list = findBygetJadsc_By_PD(
			Outcome, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete findBygetJadsc_By_PD_Last(
			String Outcome,
			OrderByComparator<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			fetchBygetJadsc_By_PD_Last(Outcome, orderByComparator);

		if (jadscAppliPreliminationDete != null) {
			return jadscAppliPreliminationDete;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Outcome=");
		sb.append(Outcome);

		sb.append("}");

		throw new NoSuchJadscAppliPreliminationDeteException(sb.toString());
	}

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	@Override
	public JadscAppliPreliminationDete fetchBygetJadsc_By_PD_Last(
		String Outcome,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		int count = countBygetJadsc_By_PD(Outcome);

		if (count == 0) {
			return null;
		}

		List<JadscAppliPreliminationDete> list = findBygetJadsc_By_PD(
			Outcome, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc appli prelimination detes before and after the current jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the current jadsc appli prelimination dete
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete[] findBygetJadsc_By_PD_PrevAndNext(
			long jadscAppliPreliminationDeteId, String Outcome,
			OrderByComparator<JadscAppliPreliminationDete> orderByComparator)
		throws NoSuchJadscAppliPreliminationDeteException {

		Outcome = Objects.toString(Outcome, "");

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			findByPrimaryKey(jadscAppliPreliminationDeteId);

		Session session = null;

		try {
			session = openSession();

			JadscAppliPreliminationDete[] array =
				new JadscAppliPreliminationDeteImpl[3];

			array[0] = getBygetJadsc_By_PD_PrevAndNext(
				session, jadscAppliPreliminationDete, Outcome,
				orderByComparator, true);

			array[1] = jadscAppliPreliminationDete;

			array[2] = getBygetJadsc_By_PD_PrevAndNext(
				session, jadscAppliPreliminationDete, Outcome,
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

	protected JadscAppliPreliminationDete getBygetJadsc_By_PD_PrevAndNext(
		Session session,
		JadscAppliPreliminationDete jadscAppliPreliminationDete, String Outcome,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE_WHERE);

		boolean bindOutcome = false;

		if (Outcome.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_3);
		}
		else {
			bindOutcome = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_2);
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
			sb.append(JadscAppliPreliminationDeteModelImpl.ORDER_BY_JPQL);
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
						jadscAppliPreliminationDete)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscAppliPreliminationDete> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc appli prelimination detes where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	@Override
	public void removeBygetJadsc_By_PD(String Outcome) {
		for (JadscAppliPreliminationDete jadscAppliPreliminationDete :
				findBygetJadsc_By_PD(
					Outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscAppliPreliminationDete);
		}
	}

	/**
	 * Returns the number of jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli prelimination detes
	 */
	@Override
	public int countBygetJadsc_By_PD(String Outcome) {
		Outcome = Objects.toString(Outcome, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_PD;

		Object[] finderArgs = new Object[] {Outcome};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIPRELIMINATIONDETE_WHERE);

			boolean bindOutcome = false;

			if (Outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_2 =
		"jadscAppliPreliminationDete.Outcome = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_PD_OUTCOME_3 =
		"(jadscAppliPreliminationDete.Outcome IS NULL OR jadscAppliPreliminationDete.Outcome = '')";

	public JadscAppliPreliminationDetePersistenceImpl() {
		setModelClass(JadscAppliPreliminationDete.class);

		setModelImplClass(JadscAppliPreliminationDeteImpl.class);
		setModelPKClass(long.class);

		setTable(JadscAppliPreliminationDeteTable.INSTANCE);
	}

	/**
	 * Caches the jadsc appli prelimination dete in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 */
	@Override
	public void cacheResult(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		entityCache.putResult(
			JadscAppliPreliminationDeteImpl.class,
			jadscAppliPreliminationDete.getPrimaryKey(),
			jadscAppliPreliminationDete);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_PD_CI,
			new Object[] {jadscAppliPreliminationDete.getCaseId()},
			jadscAppliPreliminationDete);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc appli prelimination detes in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDetes the jadsc appli prelimination detes
	 */
	@Override
	public void cacheResult(
		List<JadscAppliPreliminationDete> jadscAppliPreliminationDetes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscAppliPreliminationDetes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscAppliPreliminationDete jadscAppliPreliminationDete :
				jadscAppliPreliminationDetes) {

			if (entityCache.getResult(
					JadscAppliPreliminationDeteImpl.class,
					jadscAppliPreliminationDete.getPrimaryKey()) == null) {

				cacheResult(jadscAppliPreliminationDete);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc appli prelimination detes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscAppliPreliminationDeteImpl.class);

		finderCache.clearCache(JadscAppliPreliminationDeteImpl.class);
	}

	/**
	 * Clears the cache for the jadsc appli prelimination dete.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		entityCache.removeResult(
			JadscAppliPreliminationDeteImpl.class, jadscAppliPreliminationDete);
	}

	@Override
	public void clearCache(
		List<JadscAppliPreliminationDete> jadscAppliPreliminationDetes) {

		for (JadscAppliPreliminationDete jadscAppliPreliminationDete :
				jadscAppliPreliminationDetes) {

			entityCache.removeResult(
				JadscAppliPreliminationDeteImpl.class,
				jadscAppliPreliminationDete);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscAppliPreliminationDeteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscAppliPreliminationDeteImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscAppliPreliminationDeteModelImpl
			jadscAppliPreliminationDeteModelImpl) {

		Object[] args = new Object[] {
			jadscAppliPreliminationDeteModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_PD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_PD_CI, args,
			jadscAppliPreliminationDeteModelImpl);
	}

	/**
	 * Creates a new jadsc appli prelimination dete with the primary key. Does not add the jadsc appli prelimination dete to the database.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key for the new jadsc appli prelimination dete
	 * @return the new jadsc appli prelimination dete
	 */
	@Override
	public JadscAppliPreliminationDete create(
		long jadscAppliPreliminationDeteId) {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			new JadscAppliPreliminationDeteImpl();

		jadscAppliPreliminationDete.setNew(true);
		jadscAppliPreliminationDete.setPrimaryKey(
			jadscAppliPreliminationDeteId);

		jadscAppliPreliminationDete.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscAppliPreliminationDete;
	}

	/**
	 * Removes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete remove(
			long jadscAppliPreliminationDeteId)
		throws NoSuchJadscAppliPreliminationDeteException {

		return remove((Serializable)jadscAppliPreliminationDeteId);
	}

	/**
	 * Removes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete remove(Serializable primaryKey)
		throws NoSuchJadscAppliPreliminationDeteException {

		Session session = null;

		try {
			session = openSession();

			JadscAppliPreliminationDete jadscAppliPreliminationDete =
				(JadscAppliPreliminationDete)session.get(
					JadscAppliPreliminationDeteImpl.class, primaryKey);

			if (jadscAppliPreliminationDete == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscAppliPreliminationDeteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscAppliPreliminationDete);
		}
		catch (NoSuchJadscAppliPreliminationDeteException
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
	protected JadscAppliPreliminationDete removeImpl(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscAppliPreliminationDete)) {
				jadscAppliPreliminationDete =
					(JadscAppliPreliminationDete)session.get(
						JadscAppliPreliminationDeteImpl.class,
						jadscAppliPreliminationDete.getPrimaryKeyObj());
			}

			if (jadscAppliPreliminationDete != null) {
				session.delete(jadscAppliPreliminationDete);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscAppliPreliminationDete != null) {
			clearCache(jadscAppliPreliminationDete);
		}

		return jadscAppliPreliminationDete;
	}

	@Override
	public JadscAppliPreliminationDete updateImpl(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		boolean isNew = jadscAppliPreliminationDete.isNew();

		if (!(jadscAppliPreliminationDete instanceof
				JadscAppliPreliminationDeteModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					jadscAppliPreliminationDete.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscAppliPreliminationDete);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscAppliPreliminationDete proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscAppliPreliminationDete implementation " +
					jadscAppliPreliminationDete.getClass());
		}

		JadscAppliPreliminationDeteModelImpl
			jadscAppliPreliminationDeteModelImpl =
				(JadscAppliPreliminationDeteModelImpl)
					jadscAppliPreliminationDete;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscAppliPreliminationDete.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscAppliPreliminationDete.setCreateDate(date);
			}
			else {
				jadscAppliPreliminationDete.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscAppliPreliminationDeteModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscAppliPreliminationDete.setModifiedDate(date);
			}
			else {
				jadscAppliPreliminationDete.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscAppliPreliminationDete);
			}
			else {
				jadscAppliPreliminationDete =
					(JadscAppliPreliminationDete)session.merge(
						jadscAppliPreliminationDete);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscAppliPreliminationDeteImpl.class,
			jadscAppliPreliminationDeteModelImpl, false, true);

		cacheUniqueFindersCache(jadscAppliPreliminationDeteModelImpl);

		if (isNew) {
			jadscAppliPreliminationDete.setNew(false);
		}

		jadscAppliPreliminationDete.resetOriginalValues();

		return jadscAppliPreliminationDete;
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJadscAppliPreliminationDeteException {

		JadscAppliPreliminationDete jadscAppliPreliminationDete =
			fetchByPrimaryKey(primaryKey);

		if (jadscAppliPreliminationDete == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscAppliPreliminationDeteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscAppliPreliminationDete;
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete findByPrimaryKey(
			long jadscAppliPreliminationDeteId)
		throws NoSuchJadscAppliPreliminationDeteException {

		return findByPrimaryKey((Serializable)jadscAppliPreliminationDeteId);
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete, or <code>null</code> if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public JadscAppliPreliminationDete fetchByPrimaryKey(
		long jadscAppliPreliminationDeteId) {

		return fetchByPrimaryKey((Serializable)jadscAppliPreliminationDeteId);
	}

	/**
	 * Returns all the jadsc appli prelimination detes.
	 *
	 * @return the jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	@Override
	public List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator,
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

		List<JadscAppliPreliminationDete> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliPreliminationDete>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE;

				sql = sql.concat(
					JadscAppliPreliminationDeteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscAppliPreliminationDete>)QueryUtil.list(
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
	 * Removes all the jadsc appli prelimination detes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscAppliPreliminationDete jadscAppliPreliminationDete :
				findAll()) {

			remove(jadscAppliPreliminationDete);
		}
	}

	/**
	 * Returns the number of jadsc appli prelimination detes.
	 *
	 * @return the number of jadsc appli prelimination detes
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
					_SQL_COUNT_JADSCAPPLIPRELIMINATIONDETE);

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
		return "jadscAppliPreliminationDeteId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscAppliPreliminationDeteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc appli prelimination dete persistence.
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

		_finderPathFetchBygetJadsc_PD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_PD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_PD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_PD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_PD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_PD",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Outcome"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_PD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_PD",
			new String[] {String.class.getName()}, new String[] {"Outcome"},
			true);

		_finderPathCountBygetJadsc_By_PD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_PD",
			new String[] {String.class.getName()}, new String[] {"Outcome"},
			false);

		JadscAppliPreliminationDeteUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscAppliPreliminationDeteUtil.setPersistence(null);

		entityCache.removeCache(
			JadscAppliPreliminationDeteImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE =
		"SELECT jadscAppliPreliminationDete FROM JadscAppliPreliminationDete jadscAppliPreliminationDete";

	private static final String _SQL_SELECT_JADSCAPPLIPRELIMINATIONDETE_WHERE =
		"SELECT jadscAppliPreliminationDete FROM JadscAppliPreliminationDete jadscAppliPreliminationDete WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLIPRELIMINATIONDETE =
		"SELECT COUNT(jadscAppliPreliminationDete) FROM JadscAppliPreliminationDete jadscAppliPreliminationDete";

	private static final String _SQL_COUNT_JADSCAPPLIPRELIMINATIONDETE_WHERE =
		"SELECT COUNT(jadscAppliPreliminationDete) FROM JadscAppliPreliminationDete jadscAppliPreliminationDete WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscAppliPreliminationDete.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscAppliPreliminationDete exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscAppliPreliminationDete exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscAppliPreliminationDetePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}