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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationPreInitiationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;
import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiationTable;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationPreInitiationPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationPreInitiationUtil;
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
 * The persistence implementation for the jadsc application pre initiation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscApplicationPreInitiationPersistence.class)
public class JadscApplicationPreInitiationPersistenceImpl
	extends BasePersistenceImpl<JadscApplicationPreInitiation>
	implements JadscApplicationPreInitiationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscApplicationPreInitiationUtil</code> to access the jadsc application pre initiation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscApplicationPreInitiationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_PI_CI;
	private FinderPath _finderPathCountBygetJadsc_PI_CI;

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation findBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscApplicationPreInitiationException {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			fetchBygetJadsc_PI_CI(caseId);

		if (jadscApplicationPreInitiation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscApplicationPreInitiationException(
				sb.toString());
		}

		return jadscApplicationPreInitiation;
	}

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(String caseId) {
		return fetchBygetJadsc_PI_CI(caseId, true);
	}

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_PI_CI, finderArgs, this);
		}

		if (result instanceof JadscApplicationPreInitiation) {
			JadscApplicationPreInitiation jadscApplicationPreInitiation =
				(JadscApplicationPreInitiation)result;

			if (!Objects.equals(
					caseId, jadscApplicationPreInitiation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATIONPREINITIATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2);
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

				List<JadscApplicationPreInitiation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_PI_CI, finderArgs, list);
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
								"JadscApplicationPreInitiationPersistenceImpl.fetchBygetJadsc_PI_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscApplicationPreInitiation
						jadscApplicationPreInitiation = list.get(0);

					result = jadscApplicationPreInitiation;

					cacheResult(jadscApplicationPreInitiation);
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
			return (JadscApplicationPreInitiation)result;
		}
	}

	/**
	 * Removes the jadsc application pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application pre initiation that was removed
	 */
	@Override
	public JadscApplicationPreInitiation removeBygetJadsc_PI_CI(String caseId)
		throws NoSuchJadscApplicationPreInitiationException {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			findBygetJadsc_PI_CI(caseId);

		return remove(jadscApplicationPreInitiation);
	}

	/**
	 * Returns the number of jadsc application pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application pre initiations
	 */
	@Override
	public int countBygetJadsc_PI_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_PI_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONPREINITIATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_PI_CI_CASEID_2 =
		"jadscApplicationPreInitiation.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_PI_CI_CASEID_3 =
		"(jadscApplicationPreInitiation.caseId IS NULL OR jadscApplicationPreInitiation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_PI;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_PI;
	private FinderPath _finderPathCountBygetJadsc_By_PI;

	/**
	 * Returns all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome) {

		return findBygetJadsc_By_PI(
			outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of matching jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end) {

		return findBygetJadsc_By_PI(outcome, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator,
		boolean useFinderCache) {

		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_PI;
				finderArgs = new Object[] {outcome};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_PI;
			finderArgs = new Object[] {outcome, start, end, orderByComparator};
		}

		List<JadscApplicationPreInitiation> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationPreInitiation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscApplicationPreInitiation
						jadscApplicationPreInitiation : list) {

					if (!outcome.equals(
							jadscApplicationPreInitiation.getOutcome())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATIONPREINITIATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscApplicationPreInitiationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JadscApplicationPreInitiation>)QueryUtil.list(
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
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			OrderByComparator<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			fetchBygetJadsc_By_PI_First(outcome, orderByComparator);

		if (jadscApplicationPreInitiation != null) {
			return jadscApplicationPreInitiation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscApplicationPreInitiationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		List<JadscApplicationPreInitiation> list = findBygetJadsc_By_PI(
			outcome, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			OrderByComparator<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			fetchBygetJadsc_By_PI_Last(outcome, orderByComparator);

		if (jadscApplicationPreInitiation != null) {
			return jadscApplicationPreInitiation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("outcome=");
		sb.append(outcome);

		sb.append("}");

		throw new NoSuchJadscApplicationPreInitiationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	@Override
	public JadscApplicationPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		int count = countBygetJadsc_By_PI(outcome);

		if (count == 0) {
			return null;
		}

		List<JadscApplicationPreInitiation> list = findBygetJadsc_By_PI(
			outcome, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc application pre initiations before and after the current jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc application pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation[] findBygetJadsc_By_PI_PrevAndNext(
			long jadscAppliPreInitiationId, String outcome,
			OrderByComparator<JadscApplicationPreInitiation> orderByComparator)
		throws NoSuchJadscApplicationPreInitiationException {

		outcome = Objects.toString(outcome, "");

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			findByPrimaryKey(jadscAppliPreInitiationId);

		Session session = null;

		try {
			session = openSession();

			JadscApplicationPreInitiation[] array =
				new JadscApplicationPreInitiationImpl[3];

			array[0] = getBygetJadsc_By_PI_PrevAndNext(
				session, jadscApplicationPreInitiation, outcome,
				orderByComparator, true);

			array[1] = jadscApplicationPreInitiation;

			array[2] = getBygetJadsc_By_PI_PrevAndNext(
				session, jadscApplicationPreInitiation, outcome,
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

	protected JadscApplicationPreInitiation getBygetJadsc_By_PI_PrevAndNext(
		Session session,
		JadscApplicationPreInitiation jadscApplicationPreInitiation,
		String outcome,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATIONPREINITIATION_WHERE);

		boolean bindOutcome = false;

		if (outcome.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
		}
		else {
			bindOutcome = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
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
			sb.append(JadscApplicationPreInitiationModelImpl.ORDER_BY_JPQL);
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
						jadscApplicationPreInitiation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscApplicationPreInitiation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc application pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	@Override
	public void removeBygetJadsc_By_PI(String outcome) {
		for (JadscApplicationPreInitiation jadscApplicationPreInitiation :
				findBygetJadsc_By_PI(
					outcome, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplicationPreInitiation);
		}
	}

	/**
	 * Returns the number of jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application pre initiations
	 */
	@Override
	public int countBygetJadsc_By_PI(String outcome) {
		outcome = Objects.toString(outcome, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_PI;

		Object[] finderArgs = new Object[] {outcome};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATIONPREINITIATION_WHERE);

			boolean bindOutcome = false;

			if (outcome.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3);
			}
			else {
				bindOutcome = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_2 =
		"jadscApplicationPreInitiation.outcome = ?";

	private static final String _FINDER_COLUMN_GETJADSC_BY_PI_OUTCOME_3 =
		"(jadscApplicationPreInitiation.outcome IS NULL OR jadscApplicationPreInitiation.outcome = '')";

	public JadscApplicationPreInitiationPersistenceImpl() {
		setModelClass(JadscApplicationPreInitiation.class);

		setModelImplClass(JadscApplicationPreInitiationImpl.class);
		setModelPKClass(long.class);

		setTable(JadscApplicationPreInitiationTable.INSTANCE);
	}

	/**
	 * Caches the jadsc application pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 */
	@Override
	public void cacheResult(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		entityCache.putResult(
			JadscApplicationPreInitiationImpl.class,
			jadscApplicationPreInitiation.getPrimaryKey(),
			jadscApplicationPreInitiation);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_PI_CI,
			new Object[] {jadscApplicationPreInitiation.getCaseId()},
			jadscApplicationPreInitiation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc application pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiations the jadsc application pre initiations
	 */
	@Override
	public void cacheResult(
		List<JadscApplicationPreInitiation> jadscApplicationPreInitiations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscApplicationPreInitiations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscApplicationPreInitiation jadscApplicationPreInitiation :
				jadscApplicationPreInitiations) {

			if (entityCache.getResult(
					JadscApplicationPreInitiationImpl.class,
					jadscApplicationPreInitiation.getPrimaryKey()) == null) {

				cacheResult(jadscApplicationPreInitiation);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc application pre initiations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscApplicationPreInitiationImpl.class);

		finderCache.clearCache(JadscApplicationPreInitiationImpl.class);
	}

	/**
	 * Clears the cache for the jadsc application pre initiation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		entityCache.removeResult(
			JadscApplicationPreInitiationImpl.class,
			jadscApplicationPreInitiation);
	}

	@Override
	public void clearCache(
		List<JadscApplicationPreInitiation> jadscApplicationPreInitiations) {

		for (JadscApplicationPreInitiation jadscApplicationPreInitiation :
				jadscApplicationPreInitiations) {

			entityCache.removeResult(
				JadscApplicationPreInitiationImpl.class,
				jadscApplicationPreInitiation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscApplicationPreInitiationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscApplicationPreInitiationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscApplicationPreInitiationModelImpl
			jadscApplicationPreInitiationModelImpl) {

		Object[] args = new Object[] {
			jadscApplicationPreInitiationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_PI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_PI_CI, args,
			jadscApplicationPreInitiationModelImpl);
	}

	/**
	 * Creates a new jadsc application pre initiation with the primary key. Does not add the jadsc application pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc application pre initiation
	 * @return the new jadsc application pre initiation
	 */
	@Override
	public JadscApplicationPreInitiation create(
		long jadscAppliPreInitiationId) {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			new JadscApplicationPreInitiationImpl();

		jadscApplicationPreInitiation.setNew(true);
		jadscApplicationPreInitiation.setPrimaryKey(jadscAppliPreInitiationId);

		jadscApplicationPreInitiation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscApplicationPreInitiation;
	}

	/**
	 * Removes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation remove(long jadscAppliPreInitiationId)
		throws NoSuchJadscApplicationPreInitiationException {

		return remove((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Removes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation remove(Serializable primaryKey)
		throws NoSuchJadscApplicationPreInitiationException {

		Session session = null;

		try {
			session = openSession();

			JadscApplicationPreInitiation jadscApplicationPreInitiation =
				(JadscApplicationPreInitiation)session.get(
					JadscApplicationPreInitiationImpl.class, primaryKey);

			if (jadscApplicationPreInitiation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscApplicationPreInitiationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscApplicationPreInitiation);
		}
		catch (NoSuchJadscApplicationPreInitiationException
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
	protected JadscApplicationPreInitiation removeImpl(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscApplicationPreInitiation)) {
				jadscApplicationPreInitiation =
					(JadscApplicationPreInitiation)session.get(
						JadscApplicationPreInitiationImpl.class,
						jadscApplicationPreInitiation.getPrimaryKeyObj());
			}

			if (jadscApplicationPreInitiation != null) {
				session.delete(jadscApplicationPreInitiation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscApplicationPreInitiation != null) {
			clearCache(jadscApplicationPreInitiation);
		}

		return jadscApplicationPreInitiation;
	}

	@Override
	public JadscApplicationPreInitiation updateImpl(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		boolean isNew = jadscApplicationPreInitiation.isNew();

		if (!(jadscApplicationPreInitiation instanceof
				JadscApplicationPreInitiationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					jadscApplicationPreInitiation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscApplicationPreInitiation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscApplicationPreInitiation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscApplicationPreInitiation implementation " +
					jadscApplicationPreInitiation.getClass());
		}

		JadscApplicationPreInitiationModelImpl
			jadscApplicationPreInitiationModelImpl =
				(JadscApplicationPreInitiationModelImpl)
					jadscApplicationPreInitiation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscApplicationPreInitiation.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscApplicationPreInitiation.setCreateDate(date);
			}
			else {
				jadscApplicationPreInitiation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscApplicationPreInitiationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscApplicationPreInitiation.setModifiedDate(date);
			}
			else {
				jadscApplicationPreInitiation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscApplicationPreInitiation);
			}
			else {
				jadscApplicationPreInitiation =
					(JadscApplicationPreInitiation)session.merge(
						jadscApplicationPreInitiation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscApplicationPreInitiationImpl.class,
			jadscApplicationPreInitiationModelImpl, false, true);

		cacheUniqueFindersCache(jadscApplicationPreInitiationModelImpl);

		if (isNew) {
			jadscApplicationPreInitiation.setNew(false);
		}

		jadscApplicationPreInitiation.resetOriginalValues();

		return jadscApplicationPreInitiation;
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchJadscApplicationPreInitiationException {

		JadscApplicationPreInitiation jadscApplicationPreInitiation =
			fetchByPrimaryKey(primaryKey);

		if (jadscApplicationPreInitiation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscApplicationPreInitiationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscApplicationPreInitiation;
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws NoSuchJadscApplicationPreInitiationException {

		return findByPrimaryKey((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation, or <code>null</code> if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public JadscApplicationPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId) {

		return fetchByPrimaryKey((Serializable)jadscAppliPreInitiationId);
	}

	/**
	 * Returns all the jadsc application pre initiations.
	 *
	 * @return the jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application pre initiations
	 */
	@Override
	public List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator,
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

		List<JadscApplicationPreInitiation> list = null;

		if (useFinderCache) {
			list = (List<JadscApplicationPreInitiation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLICATIONPREINITIATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLICATIONPREINITIATION;

				sql = sql.concat(
					JadscApplicationPreInitiationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscApplicationPreInitiation>)QueryUtil.list(
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
	 * Removes all the jadsc application pre initiations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscApplicationPreInitiation jadscApplicationPreInitiation :
				findAll()) {

			remove(jadscApplicationPreInitiation);
		}
	}

	/**
	 * Returns the number of jadsc application pre initiations.
	 *
	 * @return the number of jadsc application pre initiations
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
					_SQL_COUNT_JADSCAPPLICATIONPREINITIATION);

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
		return "jadscAppliPreInitiationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLICATIONPREINITIATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscApplicationPreInitiationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc application pre initiation persistence.
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

		_finderPathFetchBygetJadsc_PI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_PI_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_PI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_PI_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_PI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"outcome"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_PI",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			true);

		_finderPathCountBygetJadsc_By_PI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_PI",
			new String[] {String.class.getName()}, new String[] {"outcome"},
			false);

		JadscApplicationPreInitiationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscApplicationPreInitiationUtil.setPersistence(null);

		entityCache.removeCache(
			JadscApplicationPreInitiationImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCAPPLICATIONPREINITIATION =
		"SELECT jadscApplicationPreInitiation FROM JadscApplicationPreInitiation jadscApplicationPreInitiation";

	private static final String
		_SQL_SELECT_JADSCAPPLICATIONPREINITIATION_WHERE =
			"SELECT jadscApplicationPreInitiation FROM JadscApplicationPreInitiation jadscApplicationPreInitiation WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLICATIONPREINITIATION =
		"SELECT COUNT(jadscApplicationPreInitiation) FROM JadscApplicationPreInitiation jadscApplicationPreInitiation";

	private static final String _SQL_COUNT_JADSCAPPLICATIONPREINITIATION_WHERE =
		"SELECT COUNT(jadscApplicationPreInitiation) FROM JadscApplicationPreInitiation jadscApplicationPreInitiation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscApplicationPreInitiation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscApplicationPreInitiation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscApplicationPreInitiation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscApplicationPreInitiationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}