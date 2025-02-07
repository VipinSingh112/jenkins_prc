/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalOrganSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganSecUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add lab medical organ sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabMedicalOrganSecPersistence.class)
public class AddLabMedicalOrganSecPersistenceImpl
	extends BasePersistenceImpl<AddLabMedicalOrganSec>
	implements AddLabMedicalOrganSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabMedicalOrganSecUtil</code> to access the add lab medical organ sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabMedicalOrganSecImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @return the range of matching add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabMedicalOrganSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalOrganSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabMedicalOrganSec addLabMedicalOrganSec : list) {
					if (janaacApplicationId !=
							addLabMedicalOrganSec.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABMEDICALORGANSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabMedicalOrganSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabMedicalOrganSec>)QueryUtil.list(
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
	 * Returns the first add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a matching add lab medical organ sec could not be found
	 */
	@Override
	public AddLabMedicalOrganSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException {

		AddLabMedicalOrganSec addLabMedicalOrganSec =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabMedicalOrganSec != null) {
			return addLabMedicalOrganSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalOrganSecException(sb.toString());
	}

	/**
	 * Returns the first add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ sec, or <code>null</code> if a matching add lab medical organ sec could not be found
	 */
	@Override
	public AddLabMedicalOrganSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator) {

		List<AddLabMedicalOrganSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a matching add lab medical organ sec could not be found
	 */
	@Override
	public AddLabMedicalOrganSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException {

		AddLabMedicalOrganSec addLabMedicalOrganSec = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addLabMedicalOrganSec != null) {
			return addLabMedicalOrganSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalOrganSecException(sb.toString());
	}

	/**
	 * Returns the last add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ sec, or <code>null</code> if a matching add lab medical organ sec could not be found
	 */
	@Override
	public AddLabMedicalOrganSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabMedicalOrganSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab medical organ secs before and after the current add lab medical organ sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the current add lab medical organ sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalOrganSecId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganSec> orderByComparator)
		throws NoSuchAddLabMedicalOrganSecException {

		AddLabMedicalOrganSec addLabMedicalOrganSec = findByPrimaryKey(
			addLabMedicalOrganSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalOrganSec[] array = new AddLabMedicalOrganSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalOrganSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabMedicalOrganSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalOrganSec, janaacApplicationId,
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

	protected AddLabMedicalOrganSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabMedicalOrganSec addLabMedicalOrganSec,
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABMEDICALORGANSEC_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabMedicalOrganSecModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLabMedicalOrganSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabMedicalOrganSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab medical organ secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabMedicalOrganSec addLabMedicalOrganSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabMedicalOrganSec);
		}
	}

	/**
	 * Returns the number of add lab medical organ secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical organ secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABMEDICALORGANSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabMedicalOrganSec.janaacApplicationId = ?";

	public AddLabMedicalOrganSecPersistenceImpl() {
		setModelClass(AddLabMedicalOrganSec.class);

		setModelImplClass(AddLabMedicalOrganSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabMedicalOrganSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab medical organ sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganSec the add lab medical organ sec
	 */
	@Override
	public void cacheResult(AddLabMedicalOrganSec addLabMedicalOrganSec) {
		entityCache.putResult(
			AddLabMedicalOrganSecImpl.class,
			addLabMedicalOrganSec.getPrimaryKey(), addLabMedicalOrganSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab medical organ secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganSecs the add lab medical organ secs
	 */
	@Override
	public void cacheResult(
		List<AddLabMedicalOrganSec> addLabMedicalOrganSecs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabMedicalOrganSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabMedicalOrganSec addLabMedicalOrganSec :
				addLabMedicalOrganSecs) {

			if (entityCache.getResult(
					AddLabMedicalOrganSecImpl.class,
					addLabMedicalOrganSec.getPrimaryKey()) == null) {

				cacheResult(addLabMedicalOrganSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab medical organ secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabMedicalOrganSecImpl.class);

		finderCache.clearCache(AddLabMedicalOrganSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab medical organ sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabMedicalOrganSec addLabMedicalOrganSec) {
		entityCache.removeResult(
			AddLabMedicalOrganSecImpl.class, addLabMedicalOrganSec);
	}

	@Override
	public void clearCache(List<AddLabMedicalOrganSec> addLabMedicalOrganSecs) {
		for (AddLabMedicalOrganSec addLabMedicalOrganSec :
				addLabMedicalOrganSecs) {

			entityCache.removeResult(
				AddLabMedicalOrganSecImpl.class, addLabMedicalOrganSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabMedicalOrganSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabMedicalOrganSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab medical organ sec with the primary key. Does not add the add lab medical organ sec to the database.
	 *
	 * @param addLabMedicalOrganSecId the primary key for the new add lab medical organ sec
	 * @return the new add lab medical organ sec
	 */
	@Override
	public AddLabMedicalOrganSec create(long addLabMedicalOrganSecId) {
		AddLabMedicalOrganSec addLabMedicalOrganSec =
			new AddLabMedicalOrganSecImpl();

		addLabMedicalOrganSec.setNew(true);
		addLabMedicalOrganSec.setPrimaryKey(addLabMedicalOrganSecId);

		addLabMedicalOrganSec.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabMedicalOrganSec;
	}

	/**
	 * Removes the add lab medical organ sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec that was removed
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec remove(long addLabMedicalOrganSecId)
		throws NoSuchAddLabMedicalOrganSecException {

		return remove((Serializable)addLabMedicalOrganSecId);
	}

	/**
	 * Removes the add lab medical organ sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec that was removed
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec remove(Serializable primaryKey)
		throws NoSuchAddLabMedicalOrganSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalOrganSec addLabMedicalOrganSec =
				(AddLabMedicalOrganSec)session.get(
					AddLabMedicalOrganSecImpl.class, primaryKey);

			if (addLabMedicalOrganSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabMedicalOrganSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabMedicalOrganSec);
		}
		catch (NoSuchAddLabMedicalOrganSecException noSuchEntityException) {
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
	protected AddLabMedicalOrganSec removeImpl(
		AddLabMedicalOrganSec addLabMedicalOrganSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabMedicalOrganSec)) {
				addLabMedicalOrganSec = (AddLabMedicalOrganSec)session.get(
					AddLabMedicalOrganSecImpl.class,
					addLabMedicalOrganSec.getPrimaryKeyObj());
			}

			if (addLabMedicalOrganSec != null) {
				session.delete(addLabMedicalOrganSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabMedicalOrganSec != null) {
			clearCache(addLabMedicalOrganSec);
		}

		return addLabMedicalOrganSec;
	}

	@Override
	public AddLabMedicalOrganSec updateImpl(
		AddLabMedicalOrganSec addLabMedicalOrganSec) {

		boolean isNew = addLabMedicalOrganSec.isNew();

		if (!(addLabMedicalOrganSec instanceof
				AddLabMedicalOrganSecModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabMedicalOrganSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabMedicalOrganSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabMedicalOrganSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabMedicalOrganSec implementation " +
					addLabMedicalOrganSec.getClass());
		}

		AddLabMedicalOrganSecModelImpl addLabMedicalOrganSecModelImpl =
			(AddLabMedicalOrganSecModelImpl)addLabMedicalOrganSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabMedicalOrganSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabMedicalOrganSec.setCreateDate(date);
			}
			else {
				addLabMedicalOrganSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabMedicalOrganSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabMedicalOrganSec.setModifiedDate(date);
			}
			else {
				addLabMedicalOrganSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabMedicalOrganSec);
			}
			else {
				addLabMedicalOrganSec = (AddLabMedicalOrganSec)session.merge(
					addLabMedicalOrganSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabMedicalOrganSecImpl.class, addLabMedicalOrganSecModelImpl,
			false, true);

		if (isNew) {
			addLabMedicalOrganSec.setNew(false);
		}

		addLabMedicalOrganSec.resetOriginalValues();

		return addLabMedicalOrganSec;
	}

	/**
	 * Returns the add lab medical organ sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabMedicalOrganSecException {

		AddLabMedicalOrganSec addLabMedicalOrganSec = fetchByPrimaryKey(
			primaryKey);

		if (addLabMedicalOrganSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabMedicalOrganSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabMedicalOrganSec;
	}

	/**
	 * Returns the add lab medical organ sec with the primary key or throws a <code>NoSuchAddLabMedicalOrganSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec
	 * @throws NoSuchAddLabMedicalOrganSecException if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec findByPrimaryKey(long addLabMedicalOrganSecId)
		throws NoSuchAddLabMedicalOrganSecException {

		return findByPrimaryKey((Serializable)addLabMedicalOrganSecId);
	}

	/**
	 * Returns the add lab medical organ sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganSecId the primary key of the add lab medical organ sec
	 * @return the add lab medical organ sec, or <code>null</code> if a add lab medical organ sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganSec fetchByPrimaryKey(
		long addLabMedicalOrganSecId) {

		return fetchByPrimaryKey((Serializable)addLabMedicalOrganSecId);
	}

	/**
	 * Returns all the add lab medical organ secs.
	 *
	 * @return the add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @return the range of add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ secs
	 * @param end the upper bound of the range of add lab medical organ secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical organ secs
	 */
	@Override
	public List<AddLabMedicalOrganSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganSec> orderByComparator,
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

		List<AddLabMedicalOrganSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalOrganSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABMEDICALORGANSEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABMEDICALORGANSEC;

				sql = sql.concat(AddLabMedicalOrganSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabMedicalOrganSec>)QueryUtil.list(
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
	 * Removes all the add lab medical organ secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabMedicalOrganSec addLabMedicalOrganSec : findAll()) {
			remove(addLabMedicalOrganSec);
		}
	}

	/**
	 * Returns the number of add lab medical organ secs.
	 *
	 * @return the number of add lab medical organ secs
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
					_SQL_COUNT_ADDLABMEDICALORGANSEC);

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
		return "addLabMedicalOrganSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABMEDICALORGANSEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabMedicalOrganSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab medical organ sec persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabMedicalOrganSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabMedicalOrganSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabMedicalOrganSecImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDLABMEDICALORGANSEC =
		"SELECT addLabMedicalOrganSec FROM AddLabMedicalOrganSec addLabMedicalOrganSec";

	private static final String _SQL_SELECT_ADDLABMEDICALORGANSEC_WHERE =
		"SELECT addLabMedicalOrganSec FROM AddLabMedicalOrganSec addLabMedicalOrganSec WHERE ";

	private static final String _SQL_COUNT_ADDLABMEDICALORGANSEC =
		"SELECT COUNT(addLabMedicalOrganSec) FROM AddLabMedicalOrganSec addLabMedicalOrganSec";

	private static final String _SQL_COUNT_ADDLABMEDICALORGANSEC_WHERE =
		"SELECT COUNT(addLabMedicalOrganSec) FROM AddLabMedicalOrganSec addLabMedicalOrganSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabMedicalOrganSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabMedicalOrganSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabMedicalOrganSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabMedicalOrganSecPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}