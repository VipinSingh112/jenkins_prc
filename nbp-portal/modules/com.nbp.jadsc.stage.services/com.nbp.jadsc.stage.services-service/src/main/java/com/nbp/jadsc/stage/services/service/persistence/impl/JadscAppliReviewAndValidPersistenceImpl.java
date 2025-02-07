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

import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliReviewAndValidException;
import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;
import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValidTable;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidImpl;
import com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliReviewAndValidPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliReviewAndValidUtil;
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
 * The persistence implementation for the jadsc appli review and valid service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JadscAppliReviewAndValidPersistence.class)
public class JadscAppliReviewAndValidPersistenceImpl
	extends BasePersistenceImpl<JadscAppliReviewAndValid>
	implements JadscAppliReviewAndValidPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JadscAppliReviewAndValidUtil</code> to access the jadsc appli review and valid persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JadscAppliReviewAndValidImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJadsc_RV_CI;
	private FinderPath _finderPathCountBygetJadsc_RV_CI;

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid findBygetJadsc_RV_CI(String caseId)
		throws NoSuchJadscAppliReviewAndValidException {

		JadscAppliReviewAndValid jadscAppliReviewAndValid =
			fetchBygetJadsc_RV_CI(caseId);

		if (jadscAppliReviewAndValid == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJadscAppliReviewAndValidException(sb.toString());
		}

		return jadscAppliReviewAndValid;
	}

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(String caseId) {
		return fetchBygetJadsc_RV_CI(caseId, true);
	}

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJadsc_RV_CI, finderArgs, this);
		}

		if (result instanceof JadscAppliReviewAndValid) {
			JadscAppliReviewAndValid jadscAppliReviewAndValid =
				(JadscAppliReviewAndValid)result;

			if (!Objects.equals(caseId, jadscAppliReviewAndValid.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLIREVIEWANDVALID_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_RV_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_RV_CI_CASEID_2);
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

				List<JadscAppliReviewAndValid> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJadsc_RV_CI, finderArgs, list);
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
								"JadscAppliReviewAndValidPersistenceImpl.fetchBygetJadsc_RV_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JadscAppliReviewAndValid jadscAppliReviewAndValid =
						list.get(0);

					result = jadscAppliReviewAndValid;

					cacheResult(jadscAppliReviewAndValid);
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
			return (JadscAppliReviewAndValid)result;
		}
	}

	/**
	 * Removes the jadsc appli review and valid where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli review and valid that was removed
	 */
	@Override
	public JadscAppliReviewAndValid removeBygetJadsc_RV_CI(String caseId)
		throws NoSuchJadscAppliReviewAndValidException {

		JadscAppliReviewAndValid jadscAppliReviewAndValid =
			findBygetJadsc_RV_CI(caseId);

		return remove(jadscAppliReviewAndValid);
	}

	/**
	 * Returns the number of jadsc appli review and valids where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli review and valids
	 */
	@Override
	public int countBygetJadsc_RV_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_RV_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIREVIEWANDVALID_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_RV_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSC_RV_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSC_RV_CI_CASEID_2 =
		"jadscAppliReviewAndValid.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSC_RV_CI_CASEID_3 =
		"(jadscAppliReviewAndValid.caseId IS NULL OR jadscAppliReviewAndValid.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJadsc_By_RV;
	private FinderPath _finderPathWithoutPaginationFindBygetJadsc_By_RV;
	private FinderPath _finderPathCountBygetJadsc_By_RV;

	/**
	 * Returns all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the matching jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication) {

		return findBygetJadsc_By_RV(
			versionOfApplication, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of matching jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end) {

		return findBygetJadsc_By_RV(versionOfApplication, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return findBygetJadsc_By_RV(
			versionOfApplication, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator,
		boolean useFinderCache) {

		versionOfApplication = Objects.toString(versionOfApplication, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJadsc_By_RV;
				finderArgs = new Object[] {versionOfApplication};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJadsc_By_RV;
			finderArgs = new Object[] {
				versionOfApplication, start, end, orderByComparator
			};
		}

		List<JadscAppliReviewAndValid> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliReviewAndValid>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JadscAppliReviewAndValid jadscAppliReviewAndValid : list) {
					if (!versionOfApplication.equals(
							jadscAppliReviewAndValid.
								getVersionOfApplication())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLIREVIEWANDVALID_WHERE);

			boolean bindVersionOfApplication = false;

			if (versionOfApplication.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_3);
			}
			else {
				bindVersionOfApplication = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JadscAppliReviewAndValidModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindVersionOfApplication) {
					queryPos.add(versionOfApplication);
				}

				list = (List<JadscAppliReviewAndValid>)QueryUtil.list(
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
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid findBygetJadsc_By_RV_First(
			String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException {

		JadscAppliReviewAndValid jadscAppliReviewAndValid =
			fetchBygetJadsc_By_RV_First(
				versionOfApplication, orderByComparator);

		if (jadscAppliReviewAndValid != null) {
			return jadscAppliReviewAndValid;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("versionOfApplication=");
		sb.append(versionOfApplication);

		sb.append("}");

		throw new NoSuchJadscAppliReviewAndValidException(sb.toString());
	}

	/**
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid fetchBygetJadsc_By_RV_First(
		String versionOfApplication,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		List<JadscAppliReviewAndValid> list = findBygetJadsc_By_RV(
			versionOfApplication, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid findBygetJadsc_By_RV_Last(
			String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException {

		JadscAppliReviewAndValid jadscAppliReviewAndValid =
			fetchBygetJadsc_By_RV_Last(versionOfApplication, orderByComparator);

		if (jadscAppliReviewAndValid != null) {
			return jadscAppliReviewAndValid;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("versionOfApplication=");
		sb.append(versionOfApplication);

		sb.append("}");

		throw new NoSuchJadscAppliReviewAndValidException(sb.toString());
	}

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	@Override
	public JadscAppliReviewAndValid fetchBygetJadsc_By_RV_Last(
		String versionOfApplication,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		int count = countBygetJadsc_By_RV(versionOfApplication);

		if (count == 0) {
			return null;
		}

		List<JadscAppliReviewAndValid> list = findBygetJadsc_By_RV(
			versionOfApplication, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc appli review and valids before and after the current jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the current jadsc appli review and valid
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid[] findBygetJadsc_By_RV_PrevAndNext(
			long jadscAppliReviewAndValidId, String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws NoSuchJadscAppliReviewAndValidException {

		versionOfApplication = Objects.toString(versionOfApplication, "");

		JadscAppliReviewAndValid jadscAppliReviewAndValid = findByPrimaryKey(
			jadscAppliReviewAndValidId);

		Session session = null;

		try {
			session = openSession();

			JadscAppliReviewAndValid[] array =
				new JadscAppliReviewAndValidImpl[3];

			array[0] = getBygetJadsc_By_RV_PrevAndNext(
				session, jadscAppliReviewAndValid, versionOfApplication,
				orderByComparator, true);

			array[1] = jadscAppliReviewAndValid;

			array[2] = getBygetJadsc_By_RV_PrevAndNext(
				session, jadscAppliReviewAndValid, versionOfApplication,
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

	protected JadscAppliReviewAndValid getBygetJadsc_By_RV_PrevAndNext(
		Session session, JadscAppliReviewAndValid jadscAppliReviewAndValid,
		String versionOfApplication,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLIREVIEWANDVALID_WHERE);

		boolean bindVersionOfApplication = false;

		if (versionOfApplication.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_3);
		}
		else {
			bindVersionOfApplication = true;

			sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_2);
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
			sb.append(JadscAppliReviewAndValidModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindVersionOfApplication) {
			queryPos.add(versionOfApplication);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscAppliReviewAndValid)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JadscAppliReviewAndValid> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc appli review and valids where versionOfApplication = &#63; from the database.
	 *
	 * @param versionOfApplication the version of application
	 */
	@Override
	public void removeBygetJadsc_By_RV(String versionOfApplication) {
		for (JadscAppliReviewAndValid jadscAppliReviewAndValid :
				findBygetJadsc_By_RV(
					versionOfApplication, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscAppliReviewAndValid);
		}
	}

	/**
	 * Returns the number of jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the number of matching jadsc appli review and valids
	 */
	@Override
	public int countBygetJadsc_By_RV(String versionOfApplication) {
		versionOfApplication = Objects.toString(versionOfApplication, "");

		FinderPath finderPath = _finderPathCountBygetJadsc_By_RV;

		Object[] finderArgs = new Object[] {versionOfApplication};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLIREVIEWANDVALID_WHERE);

			boolean bindVersionOfApplication = false;

			if (versionOfApplication.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_3);
			}
			else {
				bindVersionOfApplication = true;

				sb.append(_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindVersionOfApplication) {
					queryPos.add(versionOfApplication);
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

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_2 =
			"jadscAppliReviewAndValid.versionOfApplication = ?";

	private static final String
		_FINDER_COLUMN_GETJADSC_BY_RV_VERSIONOFAPPLICATION_3 =
			"(jadscAppliReviewAndValid.versionOfApplication IS NULL OR jadscAppliReviewAndValid.versionOfApplication = '')";

	public JadscAppliReviewAndValidPersistenceImpl() {
		setModelClass(JadscAppliReviewAndValid.class);

		setModelImplClass(JadscAppliReviewAndValidImpl.class);
		setModelPKClass(long.class);

		setTable(JadscAppliReviewAndValidTable.INSTANCE);
	}

	/**
	 * Caches the jadsc appli review and valid in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 */
	@Override
	public void cacheResult(JadscAppliReviewAndValid jadscAppliReviewAndValid) {
		entityCache.putResult(
			JadscAppliReviewAndValidImpl.class,
			jadscAppliReviewAndValid.getPrimaryKey(), jadscAppliReviewAndValid);

		finderCache.putResult(
			_finderPathFetchBygetJadsc_RV_CI,
			new Object[] {jadscAppliReviewAndValid.getCaseId()},
			jadscAppliReviewAndValid);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc appli review and valids in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValids the jadsc appli review and valids
	 */
	@Override
	public void cacheResult(
		List<JadscAppliReviewAndValid> jadscAppliReviewAndValids) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscAppliReviewAndValids.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JadscAppliReviewAndValid jadscAppliReviewAndValid :
				jadscAppliReviewAndValids) {

			if (entityCache.getResult(
					JadscAppliReviewAndValidImpl.class,
					jadscAppliReviewAndValid.getPrimaryKey()) == null) {

				cacheResult(jadscAppliReviewAndValid);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc appli review and valids.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JadscAppliReviewAndValidImpl.class);

		finderCache.clearCache(JadscAppliReviewAndValidImpl.class);
	}

	/**
	 * Clears the cache for the jadsc appli review and valid.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JadscAppliReviewAndValid jadscAppliReviewAndValid) {
		entityCache.removeResult(
			JadscAppliReviewAndValidImpl.class, jadscAppliReviewAndValid);
	}

	@Override
	public void clearCache(
		List<JadscAppliReviewAndValid> jadscAppliReviewAndValids) {

		for (JadscAppliReviewAndValid jadscAppliReviewAndValid :
				jadscAppliReviewAndValids) {

			entityCache.removeResult(
				JadscAppliReviewAndValidImpl.class, jadscAppliReviewAndValid);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JadscAppliReviewAndValidImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JadscAppliReviewAndValidImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JadscAppliReviewAndValidModelImpl jadscAppliReviewAndValidModelImpl) {

		Object[] args = new Object[] {
			jadscAppliReviewAndValidModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJadsc_RV_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJadsc_RV_CI, args,
			jadscAppliReviewAndValidModelImpl);
	}

	/**
	 * Creates a new jadsc appli review and valid with the primary key. Does not add the jadsc appli review and valid to the database.
	 *
	 * @param jadscAppliReviewAndValidId the primary key for the new jadsc appli review and valid
	 * @return the new jadsc appli review and valid
	 */
	@Override
	public JadscAppliReviewAndValid create(long jadscAppliReviewAndValidId) {
		JadscAppliReviewAndValid jadscAppliReviewAndValid =
			new JadscAppliReviewAndValidImpl();

		jadscAppliReviewAndValid.setNew(true);
		jadscAppliReviewAndValid.setPrimaryKey(jadscAppliReviewAndValidId);

		jadscAppliReviewAndValid.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscAppliReviewAndValid;
	}

	/**
	 * Removes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid remove(long jadscAppliReviewAndValidId)
		throws NoSuchJadscAppliReviewAndValidException {

		return remove((Serializable)jadscAppliReviewAndValidId);
	}

	/**
	 * Removes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid remove(Serializable primaryKey)
		throws NoSuchJadscAppliReviewAndValidException {

		Session session = null;

		try {
			session = openSession();

			JadscAppliReviewAndValid jadscAppliReviewAndValid =
				(JadscAppliReviewAndValid)session.get(
					JadscAppliReviewAndValidImpl.class, primaryKey);

			if (jadscAppliReviewAndValid == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJadscAppliReviewAndValidException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscAppliReviewAndValid);
		}
		catch (NoSuchJadscAppliReviewAndValidException noSuchEntityException) {
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
	protected JadscAppliReviewAndValid removeImpl(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscAppliReviewAndValid)) {
				jadscAppliReviewAndValid =
					(JadscAppliReviewAndValid)session.get(
						JadscAppliReviewAndValidImpl.class,
						jadscAppliReviewAndValid.getPrimaryKeyObj());
			}

			if (jadscAppliReviewAndValid != null) {
				session.delete(jadscAppliReviewAndValid);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscAppliReviewAndValid != null) {
			clearCache(jadscAppliReviewAndValid);
		}

		return jadscAppliReviewAndValid;
	}

	@Override
	public JadscAppliReviewAndValid updateImpl(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		boolean isNew = jadscAppliReviewAndValid.isNew();

		if (!(jadscAppliReviewAndValid instanceof
				JadscAppliReviewAndValidModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscAppliReviewAndValid.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscAppliReviewAndValid);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscAppliReviewAndValid proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JadscAppliReviewAndValid implementation " +
					jadscAppliReviewAndValid.getClass());
		}

		JadscAppliReviewAndValidModelImpl jadscAppliReviewAndValidModelImpl =
			(JadscAppliReviewAndValidModelImpl)jadscAppliReviewAndValid;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscAppliReviewAndValid.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscAppliReviewAndValid.setCreateDate(date);
			}
			else {
				jadscAppliReviewAndValid.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscAppliReviewAndValidModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscAppliReviewAndValid.setModifiedDate(date);
			}
			else {
				jadscAppliReviewAndValid.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscAppliReviewAndValid);
			}
			else {
				jadscAppliReviewAndValid =
					(JadscAppliReviewAndValid)session.merge(
						jadscAppliReviewAndValid);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JadscAppliReviewAndValidImpl.class,
			jadscAppliReviewAndValidModelImpl, false, true);

		cacheUniqueFindersCache(jadscAppliReviewAndValidModelImpl);

		if (isNew) {
			jadscAppliReviewAndValid.setNew(false);
		}

		jadscAppliReviewAndValid.resetOriginalValues();

		return jadscAppliReviewAndValid;
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJadscAppliReviewAndValidException {

		JadscAppliReviewAndValid jadscAppliReviewAndValid = fetchByPrimaryKey(
			primaryKey);

		if (jadscAppliReviewAndValid == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJadscAppliReviewAndValidException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscAppliReviewAndValid;
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid findByPrimaryKey(
			long jadscAppliReviewAndValidId)
		throws NoSuchJadscAppliReviewAndValidException {

		return findByPrimaryKey((Serializable)jadscAppliReviewAndValidId);
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid, or <code>null</code> if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public JadscAppliReviewAndValid fetchByPrimaryKey(
		long jadscAppliReviewAndValidId) {

		return fetchByPrimaryKey((Serializable)jadscAppliReviewAndValidId);
	}

	/**
	 * Returns all the jadsc appli review and valids.
	 *
	 * @return the jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli review and valids
	 */
	@Override
	public List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator,
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

		List<JadscAppliReviewAndValid> list = null;

		if (useFinderCache) {
			list = (List<JadscAppliReviewAndValid>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLIREVIEWANDVALID);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLIREVIEWANDVALID;

				sql = sql.concat(
					JadscAppliReviewAndValidModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JadscAppliReviewAndValid>)QueryUtil.list(
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
	 * Removes all the jadsc appli review and valids from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JadscAppliReviewAndValid jadscAppliReviewAndValid : findAll()) {
			remove(jadscAppliReviewAndValid);
		}
	}

	/**
	 * Returns the number of jadsc appli review and valids.
	 *
	 * @return the number of jadsc appli review and valids
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
					_SQL_COUNT_JADSCAPPLIREVIEWANDVALID);

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
		return "jadscAppliReviewAndValidId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLIREVIEWANDVALID;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JadscAppliReviewAndValidModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc appli review and valid persistence.
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

		_finderPathFetchBygetJadsc_RV_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJadsc_RV_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJadsc_RV_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_RV_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJadsc_By_RV = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJadsc_By_RV",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"versionOfApplication"}, true);

		_finderPathWithoutPaginationFindBygetJadsc_By_RV = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJadsc_By_RV",
			new String[] {String.class.getName()},
			new String[] {"versionOfApplication"}, true);

		_finderPathCountBygetJadsc_By_RV = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJadsc_By_RV",
			new String[] {String.class.getName()},
			new String[] {"versionOfApplication"}, false);

		JadscAppliReviewAndValidUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JadscAppliReviewAndValidUtil.setPersistence(null);

		entityCache.removeCache(JadscAppliReviewAndValidImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCAPPLIREVIEWANDVALID =
		"SELECT jadscAppliReviewAndValid FROM JadscAppliReviewAndValid jadscAppliReviewAndValid";

	private static final String _SQL_SELECT_JADSCAPPLIREVIEWANDVALID_WHERE =
		"SELECT jadscAppliReviewAndValid FROM JadscAppliReviewAndValid jadscAppliReviewAndValid WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLIREVIEWANDVALID =
		"SELECT COUNT(jadscAppliReviewAndValid) FROM JadscAppliReviewAndValid jadscAppliReviewAndValid";

	private static final String _SQL_COUNT_JADSCAPPLIREVIEWANDVALID_WHERE =
		"SELECT COUNT(jadscAppliReviewAndValid) FROM JadscAppliReviewAndValid jadscAppliReviewAndValid WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscAppliReviewAndValid.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JadscAppliReviewAndValid exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JadscAppliReviewAndValid exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JadscAppliReviewAndValidPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}