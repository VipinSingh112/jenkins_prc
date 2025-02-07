/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireApplicationStagesException;
import com.nbp.acquire.stages.service.model.AcquireApplicationStages;
import com.nbp.acquire.stages.service.model.AcquireApplicationStagesTable;
import com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireApplicationStagesPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireApplicationStagesUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireApplicationStagesPersistence.class)
public class AcquireApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<AcquireApplicationStages>
	implements AcquireApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireApplicationStagesUtil</code> to access the acquire application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireApplicationBy_AppId;
	private FinderPath _finderPathCountBygetAcquireApplicationBy_AppId;

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplicationBy_AppId(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_AppId(acquireApplicationId);

		if (acquireApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationStagesException(sb.toString());
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId) {

		return fetchBygetAcquireApplicationBy_AppId(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireApplicationBy_AppId, finderArgs,
				this);
		}

		if (result instanceof AcquireApplicationStages) {
			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)result;

			if (acquireApplicationId !=
					acquireApplicationStages.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_APPID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireApplicationBy_AppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireApplicationStagesPersistenceImpl.fetchBygetAcquireApplicationBy_AppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationStages acquireApplicationStages =
						list.get(0);

					result = acquireApplicationStages;

					cacheResult(acquireApplicationStages);
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
			return (AcquireApplicationStages)result;
		}
	}

	/**
	 * Removes the acquire application stages where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application stages that was removed
	 */
	@Override
	public AcquireApplicationStages removeBygetAcquireApplicationBy_AppId(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			findBygetAcquireApplicationBy_AppId(acquireApplicationId);

		return remove(acquireApplicationStages);
	}

	/**
	 * Returns the number of acquire application stageses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_AppId(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireApplicationBy_AppId;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_APPID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_APPID_ACQUIREAPPLICATIONID_2 =
			"acquireApplicationStages.acquireApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName;
	private FinderPath
		_finderPathCountBygetAcquireApplicationBy_CaseId_StageName;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CaseId_StageName(caseId, stageName);

		if (acquireApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationStagesException(sb.toString());
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName) {

		return fetchBygetAcquireApplicationBy_CaseId_StageName(
			caseId, stageName, true);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName,
				finderArgs, this);
		}

		if (result instanceof AcquireApplicationStages) {
			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)result;

			if (!Objects.equals(caseId, acquireApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, acquireApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<AcquireApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"AcquireApplicationStagesPersistenceImpl.fetchBygetAcquireApplicationBy_CaseId_StageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationStages acquireApplicationStages =
						list.get(0);

					result = acquireApplicationStages;

					cacheResult(acquireApplicationStages);
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
			return (AcquireApplicationStages)result;
		}
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the acquire application stages that was removed
	 */
	@Override
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			findBygetAcquireApplicationBy_CaseId_StageName(caseId, stageName);

		return remove(acquireApplicationStages);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_CaseId_StageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplicationBy_CaseId_StageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_2 =
			"acquireApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_CASEID_3 =
			"(acquireApplicationStages.caseId IS NULL OR acquireApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_2 =
			"acquireApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STAGENAME_3 =
			"(acquireApplicationStages.stageName IS NULL OR acquireApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetAcquireApplication_By_SN;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN;
	private FinderPath _finderPathCountBygetAcquireApplication_By_SN;

	/**
	 * Returns all the acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplication_By_SN(
		String stageName) {

		return findBygetAcquireApplication_By_SN(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplication_By_SN(
		String stageName, int start, int end) {

		return findBygetAcquireApplication_By_SN(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplication_By_SN(
		String stageName, int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return findBygetAcquireApplication_By_SN(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplication_By_SN(
		String stageName, int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireApplication_By_SN;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<AcquireApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplicationStages acquireApplicationStages : list) {
					if (!stageName.equals(
							acquireApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<AcquireApplicationStages>)QueryUtil.list(
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
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplication_By_SN_First(
			String stageName,
			OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplication_By_SN_First(
				stageName, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplication_By_SN_First(
		String stageName,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		List<AcquireApplicationStages> list = findBygetAcquireApplication_By_SN(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplication_By_SN_Last(
			String stageName,
			OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplication_By_SN_Last(
				stageName, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplication_By_SN_Last(
		String stageName,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		int count = countBygetAcquireApplication_By_SN(stageName);

		if (count == 0) {
			return null;
		}

		List<AcquireApplicationStages> list = findBygetAcquireApplication_By_SN(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		AcquireApplicationStages acquireApplicationStages = findByPrimaryKey(
			acquireApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplicationStages[] array =
				new AcquireApplicationStagesImpl[3];

			array[0] = getBygetAcquireApplication_By_SN_PrevAndNext(
				session, acquireApplicationStages, stageName, orderByComparator,
				true);

			array[1] = acquireApplicationStages;

			array[2] = getBygetAcquireApplication_By_SN_PrevAndNext(
				session, acquireApplicationStages, stageName, orderByComparator,
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

	protected AcquireApplicationStages
		getBygetAcquireApplication_By_SN_PrevAndNext(
			Session session, AcquireApplicationStages acquireApplicationStages,
			String stageName,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_2);
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
			sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						acquireApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetAcquireApplication_By_SN(String stageName) {
		for (AcquireApplicationStages acquireApplicationStages :
				findBygetAcquireApplication_By_SN(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireApplicationStages);
		}
	}

	/**
	 * Returns the number of acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplication_By_SN(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetAcquireApplication_By_SN;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_2 =
			"acquireApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGENAME_3 =
			"(acquireApplicationStages.stageName IS NULL OR acquireApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetAcquireApplication_By_SN_StageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN_StageStatus;
	private FinderPath
		_finderPathCountBygetAcquireApplication_By_SN_StageStatus;

	/**
	 * Returns all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus) {

		return findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN_StageStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireApplication_By_SN_StageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<AcquireApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplicationStages acquireApplicationStages : list) {
					if (!stageName.equals(
							acquireApplicationStages.getStageName()) ||
						!stageStatus.equals(
							acquireApplicationStages.getStageStatus())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				list = (List<AcquireApplicationStages>)QueryUtil.list(
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
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplication_By_SN_StageStatus_First(
				stageName, stageStatus, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		List<AcquireApplicationStages> list =
			findBygetAcquireApplication_By_SN_StageStatus(
				stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_Last(
				String stageName, String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplication_By_SN_StageStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		int count = countBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<AcquireApplicationStages> list =
			findBygetAcquireApplication_By_SN_StageStatus(
				stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		AcquireApplicationStages acquireApplicationStages = findByPrimaryKey(
			acquireApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplicationStages[] array =
				new AcquireApplicationStagesImpl[3];

			array[0] = getBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				session, acquireApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = acquireApplicationStages;

			array[2] = getBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				session, acquireApplicationStages, stageName, stageStatus,
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

	protected AcquireApplicationStages
		getBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
			Session session, AcquireApplicationStages acquireApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_2);
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
			sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						acquireApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus) {

		for (AcquireApplicationStages acquireApplicationStages :
				findBygetAcquireApplication_By_SN_StageStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(acquireApplicationStages);
		}
	}

	/**
	 * Returns the number of acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplication_By_SN_StageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_2 =
			"acquireApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGENAME_3 =
			"(acquireApplicationStages.stageName IS NULL OR acquireApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_2 =
			"acquireApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATION_BY_SN_STAGESTATUS_STAGESTATUS_3 =
			"(acquireApplicationStages.stageStatus IS NULL OR acquireApplicationStages.stageStatus = '')";

	private FinderPath
		_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status;
	private FinderPath
		_finderPathCountBygetAcquireApplicationBy_CaseId_StageName_Status;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);

		if (acquireApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationStagesException(sb.toString());
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus) {

		return fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status,
				finderArgs, this);
		}

		if (result instanceof AcquireApplicationStages) {
			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)result;

			if (!Objects.equals(caseId, acquireApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, acquireApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, acquireApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<AcquireApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageName, stageStatus
								};
							}

							_log.warn(
								"AcquireApplicationStagesPersistenceImpl.fetchBygetAcquireApplicationBy_CaseId_StageName_Status(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationStages acquireApplicationStages =
						list.get(0);

					result = acquireApplicationStages;

					cacheResult(acquireApplicationStages);
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
			return (AcquireApplicationStages)result;
		}
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	@Override
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			findBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);

		return remove(acquireApplicationStages);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_CaseId_StageName_Status(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplicationBy_CaseId_StageName_Status;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_2 =
			"acquireApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_CASEID_3 =
			"(acquireApplicationStages.caseId IS NULL OR acquireApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_2 =
			"acquireApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGENAME_3 =
			"(acquireApplicationStages.stageName IS NULL OR acquireApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_2 =
			"acquireApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STAGENAME_STATUS_STAGESTATUS_3 =
			"(acquireApplicationStages.stageStatus IS NULL OR acquireApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetAcquireApplicationBy_CaseId_Status;
	private FinderPath _finderPathCountBygetAcquireApplicationBy_CaseId_Status;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CaseId_Status(caseId, stageStatus);

		if (acquireApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationStagesException(sb.toString());
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus) {

		return fetchBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus, true);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireApplicationBy_CaseId_Status,
				finderArgs, this);
		}

		if (result instanceof AcquireApplicationStages) {
			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)result;

			if (!Objects.equals(caseId, acquireApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, acquireApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<AcquireApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireApplicationBy_CaseId_Status,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"AcquireApplicationStagesPersistenceImpl.fetchBygetAcquireApplicationBy_CaseId_Status(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationStages acquireApplicationStages =
						list.get(0);

					result = acquireApplicationStages;

					cacheResult(acquireApplicationStages);
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
			return (AcquireApplicationStages)result;
		}
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	@Override
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_Status(
				String caseId, String stageStatus)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			findBygetAcquireApplicationBy_CaseId_Status(caseId, stageStatus);

		return remove(acquireApplicationStages);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_CaseId_Status(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplicationBy_CaseId_Status;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_2 =
			"acquireApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_CASEID_3 =
			"(acquireApplicationStages.caseId IS NULL OR acquireApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_2 =
			"acquireApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_STATUS_STAGESTATUS_3 =
			"(acquireApplicationStages.stageStatus IS NULL OR acquireApplicationStages.stageStatus = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetAcquireApplicationBy_CaseId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireApplicationBy_CaseId;
	private FinderPath _finderPathCountBygetAcquireApplicationBy_CaseId;

	/**
	 * Returns all the acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplicationBy_CaseId(
		String caseId) {

		return findBygetAcquireApplicationBy_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplicationBy_CaseId(
		String caseId, int start, int end) {

		return findBygetAcquireApplicationBy_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplicationBy_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return findBygetAcquireApplicationBy_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findBygetAcquireApplicationBy_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireApplicationBy_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireApplicationBy_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AcquireApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplicationStages acquireApplicationStages : list) {
					if (!caseId.equals(acquireApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquireApplicationStages>)QueryUtil.list(
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
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_First(
			String caseId,
			OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CaseId_First(
				caseId, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CaseId_First(
		String caseId,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		List<AcquireApplicationStages> list =
			findBygetAcquireApplicationBy_CaseId(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_Last(
			String caseId,
			OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CaseId_Last(
				caseId, orderByComparator);

		if (acquireApplicationStages != null) {
			return acquireApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CaseId_Last(
		String caseId,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		int count = countBygetAcquireApplicationBy_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<AcquireApplicationStages> list =
			findBygetAcquireApplicationBy_CaseId(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages[]
			findBygetAcquireApplicationBy_CaseId_PrevAndNext(
				long acquireApplicationStagesId, String caseId,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		AcquireApplicationStages acquireApplicationStages = findByPrimaryKey(
			acquireApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplicationStages[] array =
				new AcquireApplicationStagesImpl[3];

			array[0] = getBygetAcquireApplicationBy_CaseId_PrevAndNext(
				session, acquireApplicationStages, caseId, orderByComparator,
				true);

			array[1] = acquireApplicationStages;

			array[2] = getBygetAcquireApplicationBy_CaseId_PrevAndNext(
				session, acquireApplicationStages, caseId, orderByComparator,
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

	protected AcquireApplicationStages
		getBygetAcquireApplicationBy_CaseId_PrevAndNext(
			Session session, AcquireApplicationStages acquireApplicationStages,
			String caseId,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_2);
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
			sb.append(AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						acquireApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetAcquireApplicationBy_CaseId(String caseId) {
		for (AcquireApplicationStages acquireApplicationStages :
				findBygetAcquireApplicationBy_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireApplicationStages);
		}
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplicationBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_2 =
			"acquireApplicationStages.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CASEID_CASEID_3 =
			"(acquireApplicationStages.caseId IS NULL OR acquireApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetAcquireApplicationBy_CI;
	private FinderPath _finderPathCountBygetAcquireApplicationBy_CI;

	/**
	 * Returns the acquire application stages where caseId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages findBygetAcquireApplicationBy_CI(
			String caseId)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			fetchBygetAcquireApplicationBy_CI(caseId);

		if (acquireApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationStagesException(sb.toString());
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId) {

		return fetchBygetAcquireApplicationBy_CI(caseId, true);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	@Override
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireApplicationBy_CI, finderArgs, this);
		}

		if (result instanceof AcquireApplicationStages) {
			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)result;

			if (!Objects.equals(caseId, acquireApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_2);
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

				List<AcquireApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireApplicationBy_CI,
							finderArgs, list);
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
								"AcquireApplicationStagesPersistenceImpl.fetchBygetAcquireApplicationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationStages acquireApplicationStages =
						list.get(0);

					result = acquireApplicationStages;

					cacheResult(acquireApplicationStages);
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
			return (AcquireApplicationStages)result;
		}
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application stages that was removed
	 */
	@Override
	public AcquireApplicationStages removeBygetAcquireApplicationBy_CI(
			String caseId)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages =
			findBygetAcquireApplicationBy_CI(caseId);

		return remove(acquireApplicationStages);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	@Override
	public int countBygetAcquireApplicationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireApplicationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_2 =
			"acquireApplicationStages.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBY_CI_CASEID_3 =
			"(acquireApplicationStages.caseId IS NULL OR acquireApplicationStages.caseId = '')";

	public AcquireApplicationStagesPersistenceImpl() {
		setModelClass(AcquireApplicationStages.class);

		setModelImplClass(AcquireApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the acquire application stages in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStages the acquire application stages
	 */
	@Override
	public void cacheResult(AcquireApplicationStages acquireApplicationStages) {
		entityCache.putResult(
			AcquireApplicationStagesImpl.class,
			acquireApplicationStages.getPrimaryKey(), acquireApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_AppId,
			new Object[] {acquireApplicationStages.getAcquireApplicationId()},
			acquireApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName,
			new Object[] {
				acquireApplicationStages.getCaseId(),
				acquireApplicationStages.getStageName()
			},
			acquireApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status,
			new Object[] {
				acquireApplicationStages.getCaseId(),
				acquireApplicationStages.getStageName(),
				acquireApplicationStages.getStageStatus()
			},
			acquireApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_Status,
			new Object[] {
				acquireApplicationStages.getCaseId(),
				acquireApplicationStages.getStageStatus()
			},
			acquireApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CI,
			new Object[] {acquireApplicationStages.getCaseId()},
			acquireApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire application stageses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStageses the acquire application stageses
	 */
	@Override
	public void cacheResult(
		List<AcquireApplicationStages> acquireApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireApplicationStages acquireApplicationStages :
				acquireApplicationStageses) {

			if (entityCache.getResult(
					AcquireApplicationStagesImpl.class,
					acquireApplicationStages.getPrimaryKey()) == null) {

				cacheResult(acquireApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all acquire application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireApplicationStagesImpl.class);

		finderCache.clearCache(AcquireApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the acquire application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireApplicationStages acquireApplicationStages) {
		entityCache.removeResult(
			AcquireApplicationStagesImpl.class, acquireApplicationStages);
	}

	@Override
	public void clearCache(
		List<AcquireApplicationStages> acquireApplicationStageses) {

		for (AcquireApplicationStages acquireApplicationStages :
				acquireApplicationStageses) {

			entityCache.removeResult(
				AcquireApplicationStagesImpl.class, acquireApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireApplicationStagesModelImpl acquireApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			acquireApplicationStagesModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireApplicationBy_AppId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_AppId, args,
			acquireApplicationStagesModelImpl);

		args = new Object[] {
			acquireApplicationStagesModelImpl.getCaseId(),
			acquireApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireApplicationBy_CaseId_StageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName, args,
			acquireApplicationStagesModelImpl);

		args = new Object[] {
			acquireApplicationStagesModelImpl.getCaseId(),
			acquireApplicationStagesModelImpl.getStageName(),
			acquireApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireApplicationBy_CaseId_StageName_Status,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status,
			args, acquireApplicationStagesModelImpl);

		args = new Object[] {
			acquireApplicationStagesModelImpl.getCaseId(),
			acquireApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireApplicationBy_CaseId_Status, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CaseId_Status, args,
			acquireApplicationStagesModelImpl);

		args = new Object[] {acquireApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireApplicationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireApplicationBy_CI, args,
			acquireApplicationStagesModelImpl);
	}

	/**
	 * Creates a new acquire application stages with the primary key. Does not add the acquire application stages to the database.
	 *
	 * @param acquireApplicationStagesId the primary key for the new acquire application stages
	 * @return the new acquire application stages
	 */
	@Override
	public AcquireApplicationStages create(long acquireApplicationStagesId) {
		AcquireApplicationStages acquireApplicationStages =
			new AcquireApplicationStagesImpl();

		acquireApplicationStages.setNew(true);
		acquireApplicationStages.setPrimaryKey(acquireApplicationStagesId);

		acquireApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquireApplicationStages;
	}

	/**
	 * Removes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages remove(long acquireApplicationStagesId)
		throws NoSuchAcquireApplicationStagesException {

		return remove((Serializable)acquireApplicationStagesId);
	}

	/**
	 * Removes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages remove(Serializable primaryKey)
		throws NoSuchAcquireApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			AcquireApplicationStages acquireApplicationStages =
				(AcquireApplicationStages)session.get(
					AcquireApplicationStagesImpl.class, primaryKey);

			if (acquireApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireApplicationStages);
		}
		catch (NoSuchAcquireApplicationStagesException noSuchEntityException) {
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
	protected AcquireApplicationStages removeImpl(
		AcquireApplicationStages acquireApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireApplicationStages)) {
				acquireApplicationStages =
					(AcquireApplicationStages)session.get(
						AcquireApplicationStagesImpl.class,
						acquireApplicationStages.getPrimaryKeyObj());
			}

			if (acquireApplicationStages != null) {
				session.delete(acquireApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireApplicationStages != null) {
			clearCache(acquireApplicationStages);
		}

		return acquireApplicationStages;
	}

	@Override
	public AcquireApplicationStages updateImpl(
		AcquireApplicationStages acquireApplicationStages) {

		boolean isNew = acquireApplicationStages.isNew();

		if (!(acquireApplicationStages instanceof
				AcquireApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireApplicationStages implementation " +
					acquireApplicationStages.getClass());
		}

		AcquireApplicationStagesModelImpl acquireApplicationStagesModelImpl =
			(AcquireApplicationStagesModelImpl)acquireApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireApplicationStages.setCreateDate(date);
			}
			else {
				acquireApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireApplicationStages.setModifiedDate(date);
			}
			else {
				acquireApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireApplicationStages);
			}
			else {
				acquireApplicationStages =
					(AcquireApplicationStages)session.merge(
						acquireApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireApplicationStagesImpl.class,
			acquireApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(acquireApplicationStagesModelImpl);

		if (isNew) {
			acquireApplicationStages.setNew(false);
		}

		acquireApplicationStages.resetOriginalValues();

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireApplicationStagesException {

		AcquireApplicationStages acquireApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (acquireApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireApplicationStages;
	}

	/**
	 * Returns the acquire application stages with the primary key or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages findByPrimaryKey(
			long acquireApplicationStagesId)
		throws NoSuchAcquireApplicationStagesException {

		return findByPrimaryKey((Serializable)acquireApplicationStagesId);
	}

	/**
	 * Returns the acquire application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages, or <code>null</code> if a acquire application stages with the primary key could not be found
	 */
	@Override
	public AcquireApplicationStages fetchByPrimaryKey(
		long acquireApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)acquireApplicationStagesId);
	}

	/**
	 * Returns all the acquire application stageses.
	 *
	 * @return the acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire application stageses
	 */
	@Override
	public List<AcquireApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator,
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

		List<AcquireApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREAPPLICATIONSTAGES;

				sql = sql.concat(
					AcquireApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireApplicationStages>)QueryUtil.list(
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
	 * Removes all the acquire application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireApplicationStages acquireApplicationStages : findAll()) {
			remove(acquireApplicationStages);
		}
	}

	/**
	 * Returns the number of acquire application stageses.
	 *
	 * @return the number of acquire application stageses
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
					_SQL_COUNT_ACQUIREAPPLICATIONSTAGES);

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
		return "acquireApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire application stages persistence.
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

		_finderPathFetchBygetAcquireApplicationBy_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireApplicationBy_AppId",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireApplicationBy_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireApplicationBy_AppId",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetAcquireApplicationBy_CaseId_StageName",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetAcquireApplicationBy_CaseId_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetAcquireApplicationBy_CaseId_StageName",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetAcquireApplication_By_SN =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireApplication_By_SN",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireApplication_By_SN",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetAcquireApplication_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireApplication_By_SN",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathWithPaginationFindBygetAcquireApplication_By_SN_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireApplication_By_SN_StageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetAcquireApplication_By_SN_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireApplication_By_SN_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetAcquireApplication_By_SN_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetAcquireApplication_By_SN_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetAcquireApplicationBy_CaseId_StageName_Status =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetAcquireApplicationBy_CaseId_StageName_Status",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName()
				},
				new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetAcquireApplicationBy_CaseId_StageName_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetAcquireApplicationBy_CaseId_StageName_Status",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName()
				},
				new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetAcquireApplicationBy_CaseId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetAcquireApplicationBy_CaseId_Status",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetAcquireApplicationBy_CaseId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetAcquireApplicationBy_CaseId_Status",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetAcquireApplicationBy_CaseId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireApplicationBy_CaseId",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetAcquireApplicationBy_CaseId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireApplicationBy_CaseId",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetAcquireApplicationBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireApplicationBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetAcquireApplicationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireApplicationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireApplicationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireApplicationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(AcquireApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREAPPLICATIONSTAGES =
		"SELECT acquireApplicationStages FROM AcquireApplicationStages acquireApplicationStages";

	private static final String _SQL_SELECT_ACQUIREAPPLICATIONSTAGES_WHERE =
		"SELECT acquireApplicationStages FROM AcquireApplicationStages acquireApplicationStages WHERE ";

	private static final String _SQL_COUNT_ACQUIREAPPLICATIONSTAGES =
		"SELECT COUNT(acquireApplicationStages) FROM AcquireApplicationStages acquireApplicationStages";

	private static final String _SQL_COUNT_ACQUIREAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(acquireApplicationStages) FROM AcquireApplicationStages acquireApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}