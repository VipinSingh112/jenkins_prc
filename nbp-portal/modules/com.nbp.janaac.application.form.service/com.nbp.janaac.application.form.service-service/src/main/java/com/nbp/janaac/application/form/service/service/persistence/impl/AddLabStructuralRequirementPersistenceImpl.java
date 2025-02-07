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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabStructuralRequirementException;
import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;
import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirementTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabStructuralRequirementPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabStructuralRequirementUtil;
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
 * The persistence implementation for the add lab structural requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabStructuralRequirementPersistence.class)
public class AddLabStructuralRequirementPersistenceImpl
	extends BasePersistenceImpl<AddLabStructuralRequirement>
	implements AddLabStructuralRequirementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabStructuralRequirementUtil</code> to access the add lab structural requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabStructuralRequirementImpl.class.getName();

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
	 * Returns all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of matching add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator,
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

		List<AddLabStructuralRequirement> list = null;

		if (useFinderCache) {
			list = (List<AddLabStructuralRequirement>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabStructuralRequirement addLabStructuralRequirement :
						list) {

					if (janaacApplicationId !=
							addLabStructuralRequirement.
								getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabStructuralRequirementModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabStructuralRequirement>)QueryUtil.list(
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
	 * Returns the first add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a matching add lab structural requirement could not be found
	 */
	@Override
	public AddLabStructuralRequirement findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws NoSuchAddLabStructuralRequirementException {

		AddLabStructuralRequirement addLabStructuralRequirement =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabStructuralRequirement != null) {
			return addLabStructuralRequirement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabStructuralRequirementException(sb.toString());
	}

	/**
	 * Returns the first add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab structural requirement, or <code>null</code> if a matching add lab structural requirement could not be found
	 */
	@Override
	public AddLabStructuralRequirement fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		List<AddLabStructuralRequirement> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a matching add lab structural requirement could not be found
	 */
	@Override
	public AddLabStructuralRequirement findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws NoSuchAddLabStructuralRequirementException {

		AddLabStructuralRequirement addLabStructuralRequirement =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabStructuralRequirement != null) {
			return addLabStructuralRequirement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabStructuralRequirementException(sb.toString());
	}

	/**
	 * Returns the last add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab structural requirement, or <code>null</code> if a matching add lab structural requirement could not be found
	 */
	@Override
	public AddLabStructuralRequirement fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabStructuralRequirement> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab structural requirements before and after the current add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabStructuralRequirementId the primary key of the current add lab structural requirement
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement[] findBygetJanaacById_PrevAndNext(
			long addLabStructuralRequirementId, long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws NoSuchAddLabStructuralRequirementException {

		AddLabStructuralRequirement addLabStructuralRequirement =
			findByPrimaryKey(addLabStructuralRequirementId);

		Session session = null;

		try {
			session = openSession();

			AddLabStructuralRequirement[] array =
				new AddLabStructuralRequirementImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabStructuralRequirement, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabStructuralRequirement;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabStructuralRequirement, janaacApplicationId,
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

	protected AddLabStructuralRequirement getBygetJanaacById_PrevAndNext(
		Session session,
		AddLabStructuralRequirement addLabStructuralRequirement,
		long janaacApplicationId,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT_WHERE);

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
			sb.append(AddLabStructuralRequirementModelImpl.ORDER_BY_JPQL);
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
						addLabStructuralRequirement)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabStructuralRequirement> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab structural requirements where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabStructuralRequirement addLabStructuralRequirement :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabStructuralRequirement);
		}
	}

	/**
	 * Returns the number of add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab structural requirements
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABSTRUCTURALREQUIREMENT_WHERE);

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
			"addLabStructuralRequirement.janaacApplicationId = ?";

	public AddLabStructuralRequirementPersistenceImpl() {
		setModelClass(AddLabStructuralRequirement.class);

		setModelImplClass(AddLabStructuralRequirementImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabStructuralRequirementTable.INSTANCE);
	}

	/**
	 * Caches the add lab structural requirement in the entity cache if it is enabled.
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 */
	@Override
	public void cacheResult(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		entityCache.putResult(
			AddLabStructuralRequirementImpl.class,
			addLabStructuralRequirement.getPrimaryKey(),
			addLabStructuralRequirement);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab structural requirements in the entity cache if it is enabled.
	 *
	 * @param addLabStructuralRequirements the add lab structural requirements
	 */
	@Override
	public void cacheResult(
		List<AddLabStructuralRequirement> addLabStructuralRequirements) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabStructuralRequirements.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabStructuralRequirement addLabStructuralRequirement :
				addLabStructuralRequirements) {

			if (entityCache.getResult(
					AddLabStructuralRequirementImpl.class,
					addLabStructuralRequirement.getPrimaryKey()) == null) {

				cacheResult(addLabStructuralRequirement);
			}
		}
	}

	/**
	 * Clears the cache for all add lab structural requirements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabStructuralRequirementImpl.class);

		finderCache.clearCache(AddLabStructuralRequirementImpl.class);
	}

	/**
	 * Clears the cache for the add lab structural requirement.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		entityCache.removeResult(
			AddLabStructuralRequirementImpl.class, addLabStructuralRequirement);
	}

	@Override
	public void clearCache(
		List<AddLabStructuralRequirement> addLabStructuralRequirements) {

		for (AddLabStructuralRequirement addLabStructuralRequirement :
				addLabStructuralRequirements) {

			entityCache.removeResult(
				AddLabStructuralRequirementImpl.class,
				addLabStructuralRequirement);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabStructuralRequirementImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabStructuralRequirementImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab structural requirement with the primary key. Does not add the add lab structural requirement to the database.
	 *
	 * @param addLabStructuralRequirementId the primary key for the new add lab structural requirement
	 * @return the new add lab structural requirement
	 */
	@Override
	public AddLabStructuralRequirement create(
		long addLabStructuralRequirementId) {

		AddLabStructuralRequirement addLabStructuralRequirement =
			new AddLabStructuralRequirementImpl();

		addLabStructuralRequirement.setNew(true);
		addLabStructuralRequirement.setPrimaryKey(
			addLabStructuralRequirementId);

		addLabStructuralRequirement.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabStructuralRequirement;
	}

	/**
	 * Removes the add lab structural requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement remove(
			long addLabStructuralRequirementId)
		throws NoSuchAddLabStructuralRequirementException {

		return remove((Serializable)addLabStructuralRequirementId);
	}

	/**
	 * Removes the add lab structural requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement remove(Serializable primaryKey)
		throws NoSuchAddLabStructuralRequirementException {

		Session session = null;

		try {
			session = openSession();

			AddLabStructuralRequirement addLabStructuralRequirement =
				(AddLabStructuralRequirement)session.get(
					AddLabStructuralRequirementImpl.class, primaryKey);

			if (addLabStructuralRequirement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabStructuralRequirementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabStructuralRequirement);
		}
		catch (NoSuchAddLabStructuralRequirementException
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
	protected AddLabStructuralRequirement removeImpl(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabStructuralRequirement)) {
				addLabStructuralRequirement =
					(AddLabStructuralRequirement)session.get(
						AddLabStructuralRequirementImpl.class,
						addLabStructuralRequirement.getPrimaryKeyObj());
			}

			if (addLabStructuralRequirement != null) {
				session.delete(addLabStructuralRequirement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabStructuralRequirement != null) {
			clearCache(addLabStructuralRequirement);
		}

		return addLabStructuralRequirement;
	}

	@Override
	public AddLabStructuralRequirement updateImpl(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		boolean isNew = addLabStructuralRequirement.isNew();

		if (!(addLabStructuralRequirement instanceof
				AddLabStructuralRequirementModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					addLabStructuralRequirement.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabStructuralRequirement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabStructuralRequirement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabStructuralRequirement implementation " +
					addLabStructuralRequirement.getClass());
		}

		AddLabStructuralRequirementModelImpl
			addLabStructuralRequirementModelImpl =
				(AddLabStructuralRequirementModelImpl)
					addLabStructuralRequirement;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabStructuralRequirement.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabStructuralRequirement.setCreateDate(date);
			}
			else {
				addLabStructuralRequirement.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabStructuralRequirementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabStructuralRequirement.setModifiedDate(date);
			}
			else {
				addLabStructuralRequirement.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabStructuralRequirement);
			}
			else {
				addLabStructuralRequirement =
					(AddLabStructuralRequirement)session.merge(
						addLabStructuralRequirement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabStructuralRequirementImpl.class,
			addLabStructuralRequirementModelImpl, false, true);

		if (isNew) {
			addLabStructuralRequirement.setNew(false);
		}

		addLabStructuralRequirement.resetOriginalValues();

		return addLabStructuralRequirement;
	}

	/**
	 * Returns the add lab structural requirement with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab structural requirement
	 * @return the add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabStructuralRequirementException {

		AddLabStructuralRequirement addLabStructuralRequirement =
			fetchByPrimaryKey(primaryKey);

		if (addLabStructuralRequirement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabStructuralRequirementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabStructuralRequirement;
	}

	/**
	 * Returns the add lab structural requirement with the primary key or throws a <code>NoSuchAddLabStructuralRequirementException</code> if it could not be found.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement findByPrimaryKey(
			long addLabStructuralRequirementId)
		throws NoSuchAddLabStructuralRequirementException {

		return findByPrimaryKey((Serializable)addLabStructuralRequirementId);
	}

	/**
	 * Returns the add lab structural requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement, or <code>null</code> if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public AddLabStructuralRequirement fetchByPrimaryKey(
		long addLabStructuralRequirementId) {

		return fetchByPrimaryKey((Serializable)addLabStructuralRequirementId);
	}

	/**
	 * Returns all the add lab structural requirements.
	 *
	 * @return the add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findAll(
		int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab structural requirements
	 */
	@Override
	public List<AddLabStructuralRequirement> findAll(
		int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator,
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

		List<AddLabStructuralRequirement> list = null;

		if (useFinderCache) {
			list = (List<AddLabStructuralRequirement>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT;

				sql = sql.concat(
					AddLabStructuralRequirementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabStructuralRequirement>)QueryUtil.list(
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
	 * Removes all the add lab structural requirements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabStructuralRequirement addLabStructuralRequirement :
				findAll()) {

			remove(addLabStructuralRequirement);
		}
	}

	/**
	 * Returns the number of add lab structural requirements.
	 *
	 * @return the number of add lab structural requirements
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
					_SQL_COUNT_ADDLABSTRUCTURALREQUIREMENT);

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
		return "addLabStructuralRequirementId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabStructuralRequirementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab structural requirement persistence.
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

		AddLabStructuralRequirementUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabStructuralRequirementUtil.setPersistence(null);

		entityCache.removeCache(
			AddLabStructuralRequirementImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT =
		"SELECT addLabStructuralRequirement FROM AddLabStructuralRequirement addLabStructuralRequirement";

	private static final String _SQL_SELECT_ADDLABSTRUCTURALREQUIREMENT_WHERE =
		"SELECT addLabStructuralRequirement FROM AddLabStructuralRequirement addLabStructuralRequirement WHERE ";

	private static final String _SQL_COUNT_ADDLABSTRUCTURALREQUIREMENT =
		"SELECT COUNT(addLabStructuralRequirement) FROM AddLabStructuralRequirement addLabStructuralRequirement";

	private static final String _SQL_COUNT_ADDLABSTRUCTURALREQUIREMENT_WHERE =
		"SELECT COUNT(addLabStructuralRequirement) FROM AddLabStructuralRequirement addLabStructuralRequirement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabStructuralRequirement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabStructuralRequirement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabStructuralRequirement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabStructuralRequirementPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}